package netty.echo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/22 8:19 AM
 **/
public class EchoServer {
    private final int port;

    public EchoServer(int port){
        this.port = port;
    }

    public static void main(String[] args) {
        if (args.length != 1){
            System.err.println("请使用使用："+ EchoServer.class.getSimpleName()+" <port>");
            return;
        }
        int port = Integer.parseInt(args[0]);
        new EchoServer(port).start();

    }

    private void start() {
        final EchoServerHandler echoServerHandler = new EchoServerHandler();
        EventLoopGroup group = new NioEventLoopGroup();
        // 1. 引导和绑定服务器
        ServerBootstrap bootstrap = new ServerBootstrap();
        // 2. 创建并分配一个 NioEventLoopGroup 实例进行事件处理，如接收新连接及读写数据
        bootstrap.group(group)
                .channel(NioServerSocketChannel.class)
                // 3. 指定服务器绑定本地的 InetSocketAddress
                .localAddress(new InetSocketAddress(port))
                // 4. 使用 EchoHandler 初始化每一个新的 channel
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(echoServerHandler);
                    }
                });
        ChannelFuture future = null;
        try {
            // 5. 绑定服务器
            // 异步的绑定服务器，sync 将线程阻塞直到绑定完成
            future = bootstrap.bind().sync();
            // 一直阻塞到 channel 的关闭
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            try {
                group.shutdownGracefully().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
