package com.jiacy.app.设计模式.结构型.桥梁模式.abs;

public class AbstractClassConcreteA extends AbstractClass {
    @Override
    public void operation() {
        System.out.println("实现部分逻辑具体实现A");
        implementClass.operation();
    }
}
