package com.jiacy.app.设计模式.创建型.抽象工厂模式;

import com.jiacy.app.设计模式.创建型.抽象工厂模式.factory.BenzFactory;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.factory.BmwFactory;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.factory.CarFactory;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Carriage;
import com.jiacy.app.设计模式.创建型.抽象工厂模式.product.Tyre;

/**
 * 提供一个创建一系列相关或互相依赖的接口，而不需要指定他们具体的类
 *
 * 只需更新具体的工厂，就能将一系列的产品全部替换
 */
public class Client {

    public static void main(String[] args) {
//        CarFactory factory = new BmwFactory();
        CarFactory factory = new BenzFactory();
        Tyre tyre = factory.createTyre();
        Carriage carriage = factory.crateCarriage();
        tyre.createTyre();
        carriage.createCarriage();
    }
}
