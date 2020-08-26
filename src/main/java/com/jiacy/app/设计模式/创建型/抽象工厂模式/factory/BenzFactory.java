package com.jiacy.app.设计模式.创建型.抽象工厂模式.factory;

import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.BenzCarriage;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.BenzTyre;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Carriage;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Tyre;

public class BenzFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new BenzTyre();
    }

    @Override
    public Carriage crateCarriage() {
        return new BenzCarriage();
    }
}
