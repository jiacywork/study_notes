package com.jiacy.app.网络.socket.udp;

import java.io.IOException;
import java.net.*;

public class TestUdpClient {

    public static void main(String[] args) throws IOException {
        // 构建内容和服务器信息
        InetAddress address = InetAddress.getByName("localhost");
        int port = 9999;
        byte[] data = "hello world".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, address, port);
        // 构建socket
        DatagramSocket socket = new DatagramSocket();
        // 发送请求
        socket.send(datagramPacket);

        // 接收响应
        byte[] resp = new byte[1024];
        DatagramPacket respPacket = new DatagramPacket(resp, resp.length);
        socket.receive(respPacket);
        System.out.println(new String(respPacket.getData(), 0, respPacket.getLength()));

        socket.close();
    }

}
