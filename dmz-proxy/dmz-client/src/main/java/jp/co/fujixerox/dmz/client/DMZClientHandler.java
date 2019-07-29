package jp.co.fujixerox.dmz.client;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.CharsetUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jp.co.fujixerox.dmz.log.DMZLLogFactory;
import jp.co.fujixerox.dmz.log.DMZLog;
import jp.co.fujixerox.dmz.utils.DMZClientUtils;
import jp.co.fujixerox.dmz.utils.PropertiesUtils;

public class DMZClientHandler extends SimpleChannelInboundHandler<Object> {

	private static DMZLog LOG = DMZLLogFactory.getSystemLog();
	private final WebSocketClientHandshaker handshaker;
	private ChannelPromise handshakeFuture;
	
	private final static int MAX_THREAD_NUM = Integer.parseInt(PropertiesUtils.getPropertys().getProperty("MAX_THREAD_NUM"));
	private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(MAX_THREAD_NUM);

	public DMZClientHandler(WebSocketClientHandshaker handshaker) {
		this.handshaker = handshaker;
	}

	public ChannelFuture handshakeFuture() {
		return handshakeFuture;
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) {
		handshakeFuture = ctx.newPromise();
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		handshaker.handshake(ctx.channel());
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) {
		LOG.info("WebSocket Client disconnected!");
	}

	@Override
	public void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
		Channel ch = ctx.channel();
		if (!handshaker.isHandshakeComplete()) {
			handshaker.finishHandshake(ch, (FullHttpResponse) msg);
			LOG.info("WebSocket Client connected!");
			handshakeFuture.setSuccess();
			return;
		}

		if (msg instanceof FullHttpResponse) {
			FullHttpResponse response = (FullHttpResponse) msg;
			throw new IllegalStateException("Unexpected FullHttpResponse (getStatus=" + response.status() + ", content="
					+ response.content().toString(CharsetUtil.UTF_8) + ')');
		}

		WebSocketFrame frame = (WebSocketFrame) msg;
		if (frame instanceof TextWebSocketFrame) {
			TextWebSocketFrame textFrame = (TextWebSocketFrame) frame;
			LOG.info("WebSocket Client received text message: " + textFrame.text());
		} else if (frame instanceof BinaryWebSocketFrame) {
			final BinaryWebSocketFrame binaryFrame = (BinaryWebSocketFrame) frame.copy();
			final ChannelHandlerContext channelHandlerContext = ctx;
			fixedThreadPool.execute(new Thread() {
				public void run() {
					try {
						channelHandlerContext.writeAndFlush(new BinaryWebSocketFrame(DMZClientUtils.getHttpResponse(binaryFrame)));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		} else if (frame instanceof PongWebSocketFrame) {
			LOG.info("WebSocket Client received pong");
		} else if (frame instanceof CloseWebSocketFrame) {
			LOG.info("WebSocket Client received closing");
			ch.close();
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		if (!handshakeFuture.isDone()) {
			handshakeFuture.setFailure(cause);
		}
		ctx.close();
	}
	
	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt)
			throws Exception {
		if (evt instanceof IdleStateEvent) {
			IdleStateEvent event = (IdleStateEvent) evt;
			if (event.state() == IdleState.READER_IDLE) {
				LOG.info("WebSocket client send a ping message to keeping connection");
				WebSocketFrame frame = new PingWebSocketFrame(
						Unpooled.wrappedBuffer(new byte[] { 8, 1, 8, 1 }));
				ctx.writeAndFlush(frame);
			}
		}
	}
}
