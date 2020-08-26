package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 饿汉模式，在类加载过程中就初始化对象
 */
public class Singleton {

    // 1、饿汉模式，直接在类加载过程中实例化对象
    private static final Singleton singleton = new Singleton();

    // 私有构造，防止重复实例化
    private Singleton() {
        System.out.println("构建对象过程");
    }

    public static Singleton getInstance() {
        System.out.println("获取对象实例");
        System.out.println("对象hash值" + singleton.hashCode());
        return singleton;
    }

}
