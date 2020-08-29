package com.jiacy.app.设计模式.创建型.单例模式;

import java.util.concurrent.*;

/**
 * 多线程安全测试类
 */
public class MyRunnableClient {

    private static final int totalCount = 5;
    private static final CountDownLatch latch = new CountDownLatch(totalCount);
    private static final Semaphore semaphore = new Semaphore(2);
    private static final ExecutorService execotor = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws InterruptedException {
        for(int index = 0; index < totalCount; index++) {
            try {
                semaphore.acquire();
                execotor.execute(new MyRunnable());
            } finally {
                latch.countDown();
                semaphore.release();
            }
        }
        latch.await();
        System.out.println("全部任务执行完成");
        execotor.shutdownNow();
    }
}
