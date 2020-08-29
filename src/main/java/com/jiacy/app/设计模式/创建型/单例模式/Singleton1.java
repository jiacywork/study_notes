package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 懒汉模式，在需要使用时开始初始化，注重延迟加载
 */
public class Singleton1 {

    // 方案1；添加volatile防止CPU进行指令重排序，保证内存可见性
    private volatile static Singleton1 singleton = null;

    // 私有构造，防止外部类重复实例化
    private Singleton1() {
        // 防止反射攻击，仅适用于在初始化阶段就已经实例化对象（饿汉模式、静态内部类懒汉）
        // 本模式单例就不适合使用，如果反射在正常实例之前，则会重复实例化；
        // 改进方案为使用枚举单例模式
        if(singleton != null) {
            throw new RuntimeException("单例模式禁止使用反射获取实例");
        }
        System.out.println("构建过程");
    }

    // 双重检测机制，防止高并发场景下实例化多次
    public static Singleton1 getInstance() {
        System.out.println("获取实例化对象");
        if (singleton == null) {
            synchronized (Singleton1.class) {
                if (singleton == null) {
                    System.out.println("对象为空，开始实例化");

                    /*
                     使用new初始化对象，实际过程中会执行多步操作：
                     1、分配内存
                     2、初始化对象
                     3、将对象指向分配的内存
                     隐患：
                        如果线程1发生指令重排序，按照顺序1 -> 3 -> 2实例化对象
                        在第二个线程获取对象时，外部if判断不为null，此时获取到的可能就是已经分配好内存，但是线程1还未初始化完成的对象

                      解决方案：
                        1、volatile禁止指令重排序
                        2、允许指令重排序，但是对其他线程不可见
                     */
                    singleton = new Singleton1();
                }
            }
        }
        System.out.println("对象hash值" + singleton.hashCode());
        return singleton;
    }

}
