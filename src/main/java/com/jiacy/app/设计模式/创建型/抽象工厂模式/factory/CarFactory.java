package com.jiacy.app.设计模式.创建型.抽象工厂模式.factory;

import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Carriage;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Tyre;

public interface CarFactory {

    Tyre createTyre();

    Carriage crateCarriage();

}
