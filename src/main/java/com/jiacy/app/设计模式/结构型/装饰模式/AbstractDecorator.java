package com.jiacy.app.设计模式.结构型.装饰模式;

/**
 * 抽象装饰者
 */
public class AbstractDecorator extends AbstractComponent {

    private AbstractComponent component;

    public AbstractDecorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    protected int getPrice() {
        return component.getPrice();
    }

    @Override
    protected String getDesc() {
        return component.getDesc();
    }
}
