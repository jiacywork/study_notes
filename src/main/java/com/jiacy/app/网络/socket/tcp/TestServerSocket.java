package com.jiacy.app.网络.socket.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class TestServerSocket {

    private static final int LIMIT = 3;

    private static final ExecutorService executorService = Executors.newFixedThreadPool(LIMIT);

    public static final Semaphore semaphore = new Semaphore(LIMIT);

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(9999);
        while (true) {
            System.out.println("可使用线程数:" + semaphore.availablePermits());
            if (semaphore.tryAcquire(30, TimeUnit.SECONDS)) {
                System.out.println("获取信号量");
                Socket socket = serverSocket.accept();
                executorService.execute(new ServerSocketRunnable(socket));
            } else {
                System.out.println("当前服务器忙碌...");
            }
        }
    }

}
