package com.jiacy.app.设计模式.创建型.抽象工厂模式.product;

public class BenzCarriage extends Carriage {
    @Override
    public void createCarriage() {
        System.out.println("生产奔驰车厢");
    }
}
