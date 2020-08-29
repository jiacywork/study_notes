package com.jiacy.app.设计模式.结构型.适配器模式;

/**
 * 对象适配者
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void method() {
        adaptee.adapteeMethod();
    }
}
