package com.jiacy.app.设计模式.创建型.工厂方法模式.factory;

import com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic.Arithmetic;

/**
 * 算法工厂接口，用于创建算法对象
 */
public interface ArithmeticFactory {

    Arithmetic getArithmetic();

}
