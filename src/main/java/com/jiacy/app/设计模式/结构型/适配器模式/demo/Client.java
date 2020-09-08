package com.jiacy.app.设计模式.结构型.适配器模式.demo;

public class Client {

    public static void main(String[] args) {
        DC dc = new Adapter();
        System.out.println("直流电压：" + dc.transfer());
    }
}
