package com.jiacy.app.设计模式.结构型.适配器模式;

public class Client {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.method();

        Target adapter = new ClassAdapter();
        adapter.method();

        adapter = new ObjectAdapter();
        adapter.method();
    }
}
