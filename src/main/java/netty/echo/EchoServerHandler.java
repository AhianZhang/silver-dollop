package netty.echo;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/22 8:04 AM
 **/
@ChannelHandler.Sharable //可以被多个 Channel 安全共享
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
                // 将未决消息冲刷到远程节点，并关闭该 Channel
                .addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf in = (ByteBuf) msg;

        System.out.println("服务器接收到了请求======> "+ in.toString(CharsetUtil.UTF_8));
        // 将接收到的消息返回给消费者，而不冲刷出站消息
        ctx.write(in);

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
