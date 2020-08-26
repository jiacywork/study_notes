package com.jiacy.app.设计模式.行为型.模板方法模式;

public abstract class AbstractClass {

    public final void method() {
        System.out.println("开始执行");
        String result = doSomething();
        System.out.println("result:" + result);
        System.out.println("结束执行");
    }

    protected abstract String doSomething();

}
