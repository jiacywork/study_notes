package com.jiacy.app.设计模式.行为型.观察者模式.guavatest;

import com.google.common.eventbus.EventBus;

public class GuavaEventClient {

    public static void main(String[] args) {
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post("post的内容");
    }

}
