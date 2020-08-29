package com.jiacy.app.设计模式.创建型.单例模式;

import java.io.Serializable;

/**
 * 饿汉模式，在类初始化过程中就实例化对象
 */
public class Singleton implements Serializable {

    // 1、饿汉模式，直接在类加载过程中实例化对象
    private static final Singleton singleton = new Singleton();

    // 私有构造，防止外部类重复实例化
    private Singleton() {
        // 防止反射攻击，仅适用于在初始化阶段就已经实例化对象（饿汉模式、静态内部类懒汉）
        if(singleton != null) {
            throw new RuntimeException("单例模式禁止使用反射获取实例");
        }
        System.out.println("构建对象过程");
    }

    public static Singleton getInstance() {
        System.out.println("获取对象实例");
        System.out.println("对象hash值" + singleton.hashCode());
        return singleton;
    }

    // 解决序列化和反序列化问题
    // 反序列化时，ObjectInputStream的readObject会判断有没有readResolve这个方法，如果存在，则通过反射调用该方法；如果不存在，则重新实例化
    private Object readResolve() {
        return singleton;
    }

}
