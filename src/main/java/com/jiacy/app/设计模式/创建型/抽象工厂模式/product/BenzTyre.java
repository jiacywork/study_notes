package com.jiacy.app.设计模式.创建型.抽象工厂模式.product;

public class BenzTyre extends Tyre {
    @Override
    public void createTyre() {
        System.out.println("生产奔驰轮胎");
    }
}
