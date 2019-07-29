package jp.co.fujixerox.dmz.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.ssl.SslContext;

/**
 */
public class DMZServerInitializer extends ChannelInitializer<SocketChannel> {

    private final SslContext sslCtx;

    public DMZServerInitializer(SslContext sslCtx) {
        this.sslCtx = sslCtx;
    }

    @Override
    public void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        if (sslCtx != null) {
            pipeline.addLast(sslCtx.newHandler(ch.alloc()));
        }
        pipeline.addLast(new HttpServerCodec(4096, 65536, 8192));
        pipeline.addLast(new HttpObjectAggregator(65536));
        pipeline.addLast(new DMZServerHandler());
    }
}
