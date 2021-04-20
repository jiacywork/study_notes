package com.jiacy.app.网络.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

    public static void main(String[] args) throws IOException {
        URL domainUrl = new URL("https://www.baidu.com");
        URL specUrl = new URL(domainUrl, "/s?wd=AAA");
        System.out.println(specUrl.getProtocol());
        System.out.println(specUrl.getHost());
        System.out.println(specUrl.getPort());
        System.out.println(specUrl.getPath());
        System.out.println(specUrl.getFile());
        System.out.println(specUrl.getRef());

        // 获取字节流
        InputStream inputStream = domainUrl.openStream();
        // 将字节流转换为字符流
        InputStreamReader reader = new InputStreamReader(inputStream);
        // 为字符流添加缓冲
        BufferedReader bufferedReader = new BufferedReader(reader);
        String data = bufferedReader.readLine();
        while (data != null) {
            System.out.println(data);
            data = bufferedReader.readLine();
        }
        bufferedReader.close();
        reader.close();
        inputStream.close();
    }

}
