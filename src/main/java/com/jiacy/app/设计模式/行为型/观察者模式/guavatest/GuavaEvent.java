package com.jiacy.app.设计模式.行为型.观察者模式.guavatest;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法,传入的参数是:" + str);
    }

}

