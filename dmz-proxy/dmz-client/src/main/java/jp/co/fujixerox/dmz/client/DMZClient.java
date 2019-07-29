
package jp.co.fujixerox.dmz.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.handler.timeout.IdleStateHandler;
import jp.co.fujixerox.dmz.log.DMZLLogFactory;
import jp.co.fujixerox.dmz.log.DMZLog;
import jp.co.fujixerox.dmz.utils.PropertiesUtils;

public final class DMZClient {
    private static DMZLog systemlog = DMZLLogFactory.getSystemLog();

    private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws Exception {
        List<String> uriList = new ArrayList<>();
        uriList.add("ws://" + PropertiesUtils.getPropertys().getProperty("DMZ_SERVER_IP") + ":"
                + PropertiesUtils.getPropertys().getProperty("DMZ_SERVER_PORT") + "/websocket");
        for (String uriItem : uriList) {
            final URI uri = new URI(uriItem);
            fixedThreadPool.execute(new Thread() {
                public void run() {
                    String scheme = uri.getScheme() == null ? "ws" : uri.getScheme();
                    final String host = uri.getHost() == null ? "127.0.0.1" : uri.getHost();
                    final int port;
                    if (uri.getPort() == -1) {
                        if ("ws".equalsIgnoreCase(scheme)) {
                            port = 80;
                        } else if ("wss".equalsIgnoreCase(scheme)) {
                            port = 443;
                        } else {
                            port = -1;
                        }
                    } else {
                        port = uri.getPort();
                    }

                    if (!"ws".equalsIgnoreCase(scheme) && !"wss".equalsIgnoreCase(scheme)) {
                        String logMsg = "Only WS(S) is supported.";
                        systemlog.error(logMsg);
                        System.err.println(logMsg);
                        return;
                    }

                    final boolean ssl = "wss".equalsIgnoreCase(scheme);

                    final EventLoopGroup group = new NioEventLoopGroup();
                    try {
                        final SslContext sslCtx;
                        if (ssl) {
                            sslCtx = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE)
                                    .build();

                        } else {
                            sslCtx = null;
                        }

                        // Connect with V13 (RFC 6455 aka HyBi-17). You can change it to V08 or V00.
                        // If you change it to V00, ping is not supported and remember to change
                        // HttpResponseDecoder to WebSocketHttpResponseDecoder in the pipeline.
                        final DMZClientHandler handler = new DMZClientHandler(WebSocketClientHandshakerFactory
                                .newHandshaker(uri, WebSocketVersion.V13, null, true, new DefaultHttpHeaders()));

                        Bootstrap b = new Bootstrap();
                        b.group(group).channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
                            @Override
                            protected void initChannel(SocketChannel ch) {
                                ChannelPipeline p = ch.pipeline();
                                if (sslCtx != null) {
                                    p.addLast(sslCtx.newHandler(ch.alloc(), host, port));
                                }
                                p.addLast(new HttpClientCodec(), new HttpObjectAggregator(8192),
                                        WebSocketClientCompressionHandler.INSTANCE,
                                        new IdleStateHandler(60 * 4, 0, 0, TimeUnit.SECONDS), handler);
                            }
                        });

                        Channel ch = b.connect(uri.getHost(), port).sync().channel();
                        handler.handshakeFuture().sync();

                        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                        while (true) {
                            String msg = console.readLine();
                            if (msg == null) {
                                break;
                            } else if ("bye".equals(msg.toLowerCase())) {
                                ch.writeAndFlush(new CloseWebSocketFrame());
                                ch.closeFuture().sync();
                                break;
                            } else if ("ping".equals(msg.toLowerCase())) {
                                WebSocketFrame frame = new PingWebSocketFrame(
                                        Unpooled.wrappedBuffer(new byte[] { 8, 1, 8, 1 }));
                                ch.writeAndFlush(frame);
                            } else {
                                WebSocketFrame frame = new TextWebSocketFrame(msg);
                                ch.writeAndFlush(frame);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        group.shutdownGracefully();
                    }
                }
            });
        }
    }
}
