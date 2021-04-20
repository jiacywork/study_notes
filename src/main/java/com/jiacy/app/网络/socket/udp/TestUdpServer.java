package com.jiacy.app.网络.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestUdpServer {

    public static void main(String[] args) throws IOException {
        // 创建Socket监听
        DatagramSocket socket = new DatagramSocket(9999);

        // 创建packet接收数据
        byte[] data = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);

        // 接收请求
        socket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        // 响应数据
        InetAddress address = datagramPacket.getAddress();
        int port = datagramPacket.getPort();
        byte[] resp = "received".getBytes();
        DatagramPacket respPacket = new DatagramPacket(resp, resp.length, address, port);
        socket.send(respPacket);

        // 关闭socket
        socket.close();
    }

}
