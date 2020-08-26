package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 确保系统内只存在一个示例，且自行实例化，并向系统提供这个实例
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1 = Singleton.getInstance();

        System.out.println("");
        Singleton1 singleton2 = Singleton1.getInstance();
        singleton2 = Singleton1.getInstance();
    }
}
