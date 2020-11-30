package com.jiacy.app.设计模式.行为型.中介者模式;

public class ConcreteColleague1 extends Colleague {

    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this);
    }

}