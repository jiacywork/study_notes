package com.jiacy.app.网络.socket.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerSocketRunnable implements Runnable {

    private Socket socket;

    public ServerSocketRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("当前线程ID:" + Thread.currentThread().getId());

        InputStream inputStream = null;
        InputStreamReader reader = null;
        BufferedReader bufferedReader = null;
        OutputStream outputStream = null;
        PrintWriter printWriter = null;
        try {
            // 客户端信息
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress.getAddress());

            // 获取输入流
            inputStream = socket.getInputStream();
            reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();
            String data = bufferedReader.readLine();
            while (data != null) {
                stringBuilder.append(data);
                data = bufferedReader.readLine();
            }
            System.out.println(stringBuilder.toString());
            socket.shutdownInput();

            // 响应内容
            outputStream = socket.getOutputStream();
            printWriter = new PrintWriter(outputStream);
            printWriter.write("received");
            printWriter.flush();
            socket.shutdownOutput();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            // 关闭socket连接
            try {
                if (printWriter != null) printWriter.close();
                if (outputStream != null) outputStream.close();
                if (bufferedReader != null) bufferedReader.close();
                if (reader != null) reader.close();
                if (inputStream != null) inputStream.close();
                if (socket != null) socket.close();
            } catch (Exception e) {

            } finally {
                System.out.println("释放信号量");
                TestServerSocket.semaphore.release();
            }
        }
        System.out.println("线程执行完成");
    }
}
