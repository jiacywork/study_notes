package com.jiacy.app.设计模式.创建型.简单工厂模式.factory;

import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.Arithmetic;
import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticAdd;
import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticSubtraction;

public class ArithmeticFactory {

    public Arithmetic getArithmetic(String opr) {
        Arithmetic arithmetic = null;
        if ("+".equals(opr))
            arithmetic = new ArithmeticAdd();
        else if ("-".equals(opr))
            arithmetic = new ArithmeticSubtraction();
        else
            throw new NullPointerException("暂不支持此算法");
        return arithmetic;
    }

}
