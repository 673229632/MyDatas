
package jp.co.fujixerox.dmz.server;

import static io.netty.handler.codec.http.HttpResponseStatus.BAD_REQUEST;
import static io.netty.handler.codec.http.HttpResponseStatus.FORBIDDEN;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshakerFactory;
import io.netty.util.CharsetUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import jp.co.fujixerox.dmz.bean.RequestBean;
import jp.co.fujixerox.dmz.bean.ResponseBean;
import jp.co.fujixerox.dmz.log.DMZLLogFactory;
import jp.co.fujixerox.dmz.log.DMZLog;
import jp.co.fujixerox.dmz.utils.AccessUtils;
import jp.co.fujixerox.dmz.utils.DMZServerUtils;
import jp.co.fujixerox.dmz.utils.DMZUtil;
import jp.co.fujixerox.dmz.utils.SeriallizeUtil;

import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;

/**
 * Handles handshakes and messages
 */
public class DMZServerHandler extends SimpleChannelInboundHandler<Object> {

    private static final String WEBSOCKET_PATH = "/websocket";

    private static DMZLog LOG = DMZLLogFactory.getSystemLog();

    private static ChannelFuture channelFuture;

    private static Map<String, ChannelHandlerContext> chcMap = new ConcurrentHashMap<>();

    private static Map<String, WebSocketServerHandshaker> handshakerMap = new HashMap<>();

    @Override
    public void channelRead0(ChannelHandlerContext ctx, Object msg) {
        if (msg instanceof FullHttpRequest) {
            handleHttpRequest(ctx, (FullHttpRequest) msg);
        } else if (msg instanceof WebSocketFrame) {
            handleWebSocketFrame(ctx, (WebSocketFrame) msg);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @SuppressWarnings("deprecation")
    private void handleHttpRequest(ChannelHandlerContext ctx, FullHttpRequest req) {
        // Handle a bad request.
        if (!req.decoderResult().isSuccess()) {
            String message = req.decoderResult().cause().getMessage();
            LOG.warn(req.getMethod() + " " + req.getUri() + " " + message);
            sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST,
                    Unpooled.copiedBuffer(message, CharsetUtil.UTF_8)));
            return;
        }

        if (!HttpMethod.GET.equals(req.method()) && !HttpMethod.POST.equals(req.method())) {
            String message = "Method is not supported";
            LOG.warn(req.getMethod() + " " + req.getUri() + " " + message);
            sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST,
                    Unpooled.copiedBuffer(message, CharsetUtil.UTF_8)));
            return;
        }

        if (StringUtils.isNotEmpty(req.headers().get(HttpHeaderNames.SEC_WEBSOCKET_ORIGIN))) {
            if (handshakerMap.containsKey("http8080")) {
                String message = "WebSocket has been handshaked";
                LOG.warn(req.getMethod() + " " + req.getUri() + " " + message);
                sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST,
                        Unpooled.copiedBuffer(message, CharsetUtil.UTF_8)));
                return;
            }
        }

        if (handshakerMap.get("http8080") != null) {
            // modify for special ajax request
            int index = req.getUri().indexOf("/http");
            if (index >= 0) {
                LOG.warn("The original URI " + req.getUri());
                req.setUri(req.getUri().substring(index + 1));
            }

            RequestBean rb = new RequestBean();
            try {
                rb = DMZServerUtils.getHttpRequset(ctx, req);
            } catch (Exception e) {
                sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, BAD_REQUEST));
                LOG.error(e.getMessage());
                return;
            }

            // just by TrustedSites, stop unsafe request
            if (!AccessUtils.isAllowAccess(rb)) {
                String message = "The request site is not in trust sites";
                LOG.warn(DMZUtil.getRealURL(rb) + " " + message);
                sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HTTP_1_1, FORBIDDEN,
                        Unpooled.copiedBuffer(message, CharsetUtil.UTF_8)));
                return;
            }

            LOG.info(DMZUtil.getRealURL(rb));
            chcMap.put(rb.getObjectId(), ctx);

            // send to fx here
            channelFuture.channel().writeAndFlush(new BinaryWebSocketFrame(DMZServerUtils.Convert(rb)));
            return;
        }

        // Handshake
        WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(getWebSocketLocation(req),
                null, true, 5 * 1024 * 1024);
        WebSocketServerHandshaker handshaker = wsFactory.newHandshaker(req);
        if (handshaker == null) {
            WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(ctx.channel());
        } else {
            channelFuture = handshaker.handshake(ctx.channel(), req);
            if (!handshakerMap.containsKey("http8080")) {
                handshakerMap.put("http8080", handshaker);
            }
        }
    }

    private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame) {

        // Check for closing frame
        if (frame instanceof CloseWebSocketFrame) {
            handshakerMap.get("http8080").close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
            return;
        }
        if (frame instanceof PingWebSocketFrame) {
            LOG.info("WebSocket server received ping message to keep alive");
            ctx.write(new PongWebSocketFrame(frame.content().retain()));
            return;
        }
        if (frame instanceof TextWebSocketFrame) {
            // Echo the frame
            ctx.write(frame.retain());
            return;
        }
        if (frame instanceof BinaryWebSocketFrame) {
            try {
                sendHttpPesponse(DMZServerUtils.getHttpResponse((BinaryWebSocketFrame) frame));
            } catch (Exception e) {
                LOG.info(e.getMessage());
            }
            return;
        }
    }

    private static void sendHttpPesponse(ResponseBean bean) {
        FullHttpResponse res;
        if (bean.getContent() == null) {
            res = new DefaultFullHttpResponse(HTTP_1_1, HttpResponseStatus.valueOf(bean.statusCode));
        } else {
            res = new DefaultFullHttpResponse(HTTP_1_1, HttpResponseStatus.valueOf(bean.statusCode),
                    Unpooled.copiedBuffer(bean.getContent()));
            HttpUtil.setContentLength(res, bean.getContent().length);
        }

        Header[] headers = (Header[]) SeriallizeUtil.toObject(bean.getHeaders());

        for (Header header : headers) {
            res.headers().add(header.getName(), header.getValue());
        }

        LOG.debug("*********[DMZServerHandler.sendHttpPesponse]dmz-Server get Response start******");
        LOG.debug(res.toString());
        LOG.debug("*********[DMZServerHandler.sendHttpPesponse]dmz-Server get Response end********");

        res.headers().set("Access-Control-Allow-Origin", "*");
        LOG.info("Response for:" + DMZUtil.getRealURL(bean) + " " + res.status().code() + " "
                + res.status().reasonPhrase());

        sendHttpResponse(chcMap.get(bean.getObjectId()), null, res);

        if (chcMap.containsKey(bean.getObjectId())) {
            chcMap.remove(bean.getObjectId());
        }
    }

    private static void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest req, FullHttpResponse res) {

        // Send the response and close the connection if necessary.
        ChannelFuture f = ctx.channel().writeAndFlush(res);

        if ((req != null && !HttpUtil.isKeepAlive(req)) || res.status().code() != 200) {
            f.addListener(ChannelFutureListener.CLOSE);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    private static String getWebSocketLocation(FullHttpRequest req) {
        String location = req.headers().get(HttpHeaderNames.SEC_WEBSOCKET_ORIGIN) + WEBSOCKET_PATH;
        if (location.startsWith("https")) {
            return "wss://" + location;
        } else {
            return "ws://" + location;
        }
    }
}
