package com.jiacy.app.设计模式.结构型.装饰模式;

/**
 * 具体装饰者1
 */
public class ConcreteDecorator2 extends AbstractDecorator {
    public ConcreteDecorator2(AbstractComponent component) {
        super(component);
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }
}
