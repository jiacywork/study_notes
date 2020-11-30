package com.jiacy.app.设计模式.结构型.装饰模式;

public class Client {

    public static void main(String[] args) {
        AbstractComponent component = new ConcreteCompoment();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component = new ConcreteDecorator2(component);
        System.out.println(component.getDesc() + " 的价格是：" + component.getPrice());
    }

}
