package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 用于测试多线程安全
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Singleton1 singleton = Singleton1.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + singleton.hashCode());
    }
}
