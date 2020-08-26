package com.jiacy.app.设计模式.创建型.抽象工厂模式.factory;

import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.*;

public class BmwFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new BmwTyre();
    }

    @Override
    public Carriage crateCarriage() {
        return new BmwCarriage();
    }
}
