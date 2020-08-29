package com.jiacy.app.设计模式.结构型.装饰模式;

public class ConcreteCompoment extends AbstractComponent {
    @Override
    protected int getPrice() {
        return 8;
    }

    @Override
    protected String getDesc() {
        return "煎饼";
    }
}
