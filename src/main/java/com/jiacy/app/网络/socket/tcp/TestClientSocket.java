package com.jiacy.app.网络.socket.tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestClientSocket {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);

        // 发送内容
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.write("hello world");
        printWriter.flush();
        socket.shutdownOutput();

        // 获取输入流
        InputStream inputStream = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        String data = bufferedReader.readLine();
        while (data != null) {
            stringBuilder.append(data);
            data = bufferedReader.readLine();
        }
        System.out.println(stringBuilder.toString());
        socket.shutdownInput();

        // 关闭
        bufferedReader.close();
        reader.close();
        inputStream.close();
        printWriter.close();
        outputStream.close();
        socket.close();
    }

}
