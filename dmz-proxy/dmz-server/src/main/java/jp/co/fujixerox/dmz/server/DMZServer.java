package jp.co.fujixerox.dmz.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.SelfSignedCertificate;
import jp.co.fujixerox.dmz.log.DMZLLogFactory;
import jp.co.fujixerox.dmz.log.DMZLog;
import jp.co.fujixerox.dmz.utils.PropertiesUtils;

/**
 * connect websocket which is served at:
 *
 * http://localhost:8080/websocket
 *
 */
public final class DMZServer  implements Runnable{
	private static DMZLog LOG = DMZLLogFactory.getSystemLog();
	// static final boolean SSL = System.getProperty("ssl") != null;
	// static final int PORT = Integer.parseInt(System.getProperty("port", SSL ?
	// "8443" : "8080"));
	private final static String listenPorts = PropertiesUtils.getPropertys().getProperty("ListenPorts");
	private final static String[] portArr = listenPorts.split(",");
	private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(portArr.length);

	public void run() { 
		EventLoopGroup bossGroup = new NioEventLoopGroup(1);
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		for (String p : portArr) {
			final int PORT = Integer.parseInt(p);
			final boolean SSL = PORT == 443 ? true : false;
			fixedThreadPool.execute(new Thread() {
				public void run() {
					// Configure SSL.
					SslContext sslCtx = null;
					try {
						if (SSL) {
							SelfSignedCertificate ssc = new SelfSignedCertificate();
							sslCtx = SslContextBuilder.forServer(ssc.certificate(), ssc.privateKey()).build();
						} else {
							sslCtx = null;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					String logMsg = null;
					try {
						ServerBootstrap b = new ServerBootstrap();
						b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
								.childHandler(new DMZServerInitializer(sslCtx));

						Channel ch = b.bind(PORT).sync().channel();
						logMsg = "Open your web browser and navigate to " + (SSL ? "https" : "http") + "://127.0.0.1:"
								+ PORT + '/';
						LOG.info(logMsg);

						ch.closeFuture().sync();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
//		bossGroup.shutdownGracefully();
//		workerGroup.shutdownGracefully();
	}
}
