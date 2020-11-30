package com.jiacy.app.设计模式.行为型.中介者模式;

public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl);
}
