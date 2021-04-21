package com.jiacy.app.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;

/**
 * Nio服务端
 */
public class NioServer {

    /**
     * 启动服务端
     * @throws IOException
     */
    public void start() throws IOException {
        // 创建Selector
        Selector selector = Selector.open();
        // 创建Channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定端口
        serverSocketChannel.bind(new InetSocketAddress(9999));
        // 设置非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // 注册连接事件到Selector
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("服务端已启动");

        for (;;) {
            // 获取就绪的Channel
            int select = selector.select(10 * 1000);
            if (select == 0) {
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                // 移出，否则Set内实例会越来越多
                iterator.remove();
                // 根据不同的事件类型进行不同的处理
                if (selectionKey.isAcceptable()) {
                    acceptHandler(serverSocketChannel, selector);
                }
                if (selectionKey.isReadable()) {
                    readHandler(selectionKey, selector);
                }
            }
        }
    }

    /**
     * 处理read事件
     */
    private void readHandler(SelectionKey selectionKey, Selector selector) throws IOException {
        // 从SelectionKey内获取Channel
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        // 创建Buffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 循环读取请求
        StringBuilder stringBuilder = new StringBuilder();
        while(socketChannel.read(byteBuffer) > 0) {
            // 切换到读模式
            byteBuffer.flip();
            // 追加内容
            stringBuilder.append(StandardCharsets.UTF_8.decode(byteBuffer));
        }
        System.out.println(stringBuilder.toString());
        // 重新注册到Selector
        socketChannel.register(selector, SelectionKey.OP_READ);
    }

    /**
     * 处理Accept事件
     */
    private void acceptHandler(ServerSocketChannel serverSocketChannel, Selector selector) throws IOException {
        // 创建Channel
        SocketChannel socketChannel = serverSocketChannel.accept();
        // 设置非阻塞模式
        socketChannel.configureBlocking(false);
        // 注册到Selector
        socketChannel.register(selector, SelectionKey.OP_READ);
        // 响应客户端
        socketChannel.write(StandardCharsets.UTF_8.encode("Hello World"));
    }

    public static void main(String[] args) throws IOException {
        new NioServer().start();
    }

}
