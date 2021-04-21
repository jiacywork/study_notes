package com.jiacy.app.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

/**
 * Niobium客户端
 */
public class NioClient {

    /**
     * 启动
     */
    public void start() throws IOException {
        // 创建Channel
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));

        // 读取服务端连接请求的响应
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        StringBuilder stringBuilder = new StringBuilder();
        while (socketChannel.read(byteBuffer) > 0) {
            byteBuffer.flip();
            stringBuilder.append(StandardCharsets.UTF_8.decode(byteBuffer));
        }
        System.out.println(stringBuilder);

        // 发送请求
        socketChannel.write(StandardCharsets.UTF_8.encode("你好哇！"));

        // 关闭连接
        socketChannel.close();
    }

    public static void main(String[] args) throws IOException {
        new NioClient().start();
    }

}
