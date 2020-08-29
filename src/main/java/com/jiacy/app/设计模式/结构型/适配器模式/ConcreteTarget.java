package com.jiacy.app.设计模式.结构型.适配器模式;

public class ConcreteTarget implements Target {
    @Override
    public void method() {
        System.out.println("目标对象方法");
    }
}
