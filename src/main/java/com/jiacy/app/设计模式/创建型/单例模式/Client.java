package com.jiacy.app.设计模式.创建型.单例模式;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 确保系统内只存在一个示例，且自行实例化，并向系统提供这个实例
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        System.out.println("--------------饿汉模式--------------");
//        Singleton singleton = Singleton.getInstance();
//
//        // 序列化和反序列化安全
//            // 序列化
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_serial.txt"));
//        oos.writeObject(singleton);
//            // 反序列化
//        File file = new File("singleton_serial.txt");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        Singleton newSingleton1 = (Singleton) ois.readObject();
//            // 对比结果
//        System.out.println(singleton == newSingleton1);
//
//        // 反射攻击示例一
//        Class clazz = Class.forName(Singleton.class.getName());
//            // 获取构造器，修改权限，并重新初始化
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton newSingleton2 = (Singleton) constructor.newInstance();
//        System.out.println(singleton == newSingleton2);
//
//        System.out.println("--------------懒汉模式--------------");
//        // 双重检测-懒汉单例模式
//        Singleton1 singleton1 = Singleton1.getInstance();
//        // 静态内部类-懒汉单例模式
//        Singleton2 singleton2 = Singleton2.getInstance();

//        // 反射攻击示例二，如果反射在正常实例化之前，则会实例化2个对象
//        Class clazz = Class.forName(Singleton1.class.getName());
//            // 获取构造器，修改权限，并重新初始化
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton1 newSingleton11 = (Singleton1) constructor.newInstance();
//
//        Singleton1 singleton1 = Singleton1.getInstance();
//        System.out.println(singleton1 == newSingleton11);

        // 枚举单例模式
        SingletonEnum2 singletonEnum = SingletonEnum2.getInstance();
        singletonEnum.doSomething();
        // 序列化和反序列化安全
            // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_serial.txt"));
        oos.writeObject(singletonEnum);
            // 反序列化
        File file = new File("singleton_serial.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonEnum2 newSingletonEnum = (SingletonEnum2) ois.readObject();
            // 对比结果
        System.out.println(singletonEnum == newSingletonEnum);

        // 反射
        Class clazz = Class.forName(SingletonEnum2.class.getName());
            // 获取构造器，修改权限，并重新初始化
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        SingletonEnum2 newSingleton11 = (SingletonEnum2) constructor.newInstance("牛批", 666);

        System.out.println(singletonEnum == newSingleton11);
    }

}
