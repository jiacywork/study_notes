package com.jiacy.app.设计模式.行为型.模板方法模式;

public class ImplementClassB extends AbstractClass {
    @Override
    public String doSomething() {
        System.out.println("start doSomething ... ");
        return "FAILED";
    }
}
