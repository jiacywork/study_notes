package com.jiacy.app.设计模式.行为型.策略模式;

public class ConcreteStrategy1 extends AbstractStrategy {
    @Override
    protected void operate() {
        System.out.println("策略实现1...");
    }
}
