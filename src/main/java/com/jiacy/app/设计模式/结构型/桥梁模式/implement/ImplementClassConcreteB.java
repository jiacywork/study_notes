package com.jiacy.app.设计模式.结构型.桥梁模式.implement;

public class ImplementClassConcreteB implements ImplementClass {
    @Override
    public void operation() {
        System.out.println("抽象部分逻辑具体实现B");
    }
}
