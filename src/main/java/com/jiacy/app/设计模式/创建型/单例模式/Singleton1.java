package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 懒汉模式，在需要使用时开始初始化
 */
public class Singleton1 {

    // 添加volatile防止指令重排序，出现多次构建的情况
    private static volatile Singleton1 singleton = null;

    private Singleton1() {
        System.out.println("构建过程");
    }

    // 双重检测机制，防止高并发场景下实例化多次
    public static Singleton1 getInstance() {
        System.out.println("获取实例化对象");
        if (singleton == null) {
            synchronized (Singleton1.class) {
                if (singleton == null) {
                    System.out.println("对象为空，开始实例化");
                    singleton = new Singleton1();
                }
            }
        }
        System.out.println("对象hash值" + singleton.hashCode());
        return singleton;
    }

}
