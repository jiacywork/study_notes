package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 懒汉模式，使用静态内部类实现单例模式
 */
public class Singleton2 {

    private Singleton2() {
        // 防止反射攻击，仅适用于在初始化阶段就已经实例化对象
        if(InnerClass.singleton != null) {
            throw new RuntimeException("单例模式禁止使用反射获取实例");
        }
        System.out.println("实例化对象");
    }

    // 原理：JVM会在静态内部类的初始化阶段（被类加载器加载之后，线程使用之前）获取对象初始化锁，同步多个线程对一个对象的初始化
    // 主要在于哪个线程先拿到InnerClass对象初始化锁
    private static class InnerClass {
        private static Singleton2 singleton = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return InnerClass.singleton;
    }

}
