package com.jiacy.app.设计模式.创建型.单例模式;

import java.io.Serializable;

/**
 * 枚举模式的单例模式写法一，测试发现没法防止序列化和反射攻击
 */
public class SingletonEnum implements Serializable {

    private SingletonEnum() {
        System.out.println("枚举单例实例化...");
    }

    public static SingletonEnum getInstance() {
        return EnumInstance.INSTANCE.getSingletonEnum();
    }

    // 静态枚举类
    private enum EnumInstance {

        INSTANCE;

        private SingletonEnum singletonEnum;

        EnumInstance() {
            singletonEnum = new SingletonEnum();
        }

        public SingletonEnum getSingletonEnum() {
            return singletonEnum;
        }

    }

}
