package com.jiacy.app.设计模式.创建型.单例模式;

/**
 * 枚举模式的单例模式写法二，可防止序列化和反射攻击
 *
 * 枚举类型省略了私有的无参构造器，无法通过无参构造器反射获取对象；
 * 另外，有参构造器也无法通过反射实例化对象，故能够防止反射攻击
 */
public enum SingletonEnum2 implements EnumSingleton {

    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("具体操作");
        }
    };

    public static SingletonEnum2 getInstance() {
        return INSTANCE;
    }

}
