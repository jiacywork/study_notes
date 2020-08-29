package com.jiacy.app.设计模式.结构型.适配器模式;

/**
 * 适配者(类适配者)
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void method() {
        super.adapteeMethod();
    }
}
