package com.jiacy.app.设计模式.创建型.工厂方法模式;

import com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic.ArithmeticAdd;
import com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic.ArithmeticSubtraction;
import com.jiacy.app.设计模式.创建型.工厂方法模式.factory.ArithmeticFactory;
import com.jiacy.app.设计模式.创建型.工厂方法模式.factory.ArithmeticFactoryAdd;
import com.jiacy.app.设计模式.创建型.工厂方法模式.factory.ArithmeticFactorySubtraction;

/**
 * 工厂方法模式，定义一个创建对象的接口，让子类决定实例化哪个类，将对象的实例化延迟到其子类
 *
 * 适用于类数量较多，产品族大的场景，更多的关注产品等级（产品数量）
 */
public class Client {

    public static void main(String[] args) {
        ArithmeticFactory factory = new ArithmeticFactoryAdd();
        ArithmeticAdd add = (ArithmeticAdd) factory.getArithmetic();
        add.setA(1);
        add.setB(3);
        System.out.println(add.result());

        factory = new ArithmeticFactorySubtraction();
        ArithmeticSubtraction subtraction = (ArithmeticSubtraction) factory.getArithmetic();
        subtraction.setA(1);
        subtraction.setB(3);
        System.out.println(subtraction.result());
    }
}
