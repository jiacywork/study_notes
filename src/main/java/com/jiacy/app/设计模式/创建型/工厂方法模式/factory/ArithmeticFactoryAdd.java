package com.jiacy.app.设计模式.创建型.工厂方法模式.factory;

import com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic.Arithmetic;
import com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic.ArithmeticAdd;

public class ArithmeticFactoryAdd implements ArithmeticFactory {
    @Override
    public Arithmetic getArithmetic() {
        return new ArithmeticAdd();
    }
}
