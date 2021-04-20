package com.jiacy.app.网络.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

        InetAddress inetAddress1 = InetAddress.getByName("DESKTOP-0BIAA6D");
        System.out.println(inetAddress1.getHostName());
        System.out.println(inetAddress1.getHostAddress());
    }

}
