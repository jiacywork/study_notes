package com.jiacy.app.设计模式.创建型.简单工厂模式;

import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticAdd;
import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticSubtraction;
import com.jiacy.app.设计模式.创建型.简单工厂模式.factory.ArithmeticFactory;

/**
 * 严格上简单工厂模式不是设计模式规范的一种，违反了开闭原则
 *
 * 简单工厂模式，将对象创建逻辑封装在工厂内
 *
 * 当产品对象需要扩展时，对于产品可以进行扩展，但是工厂也要相应进行修改，违犯了开闭原则
 */
public class Client {

    public static void main(String[] args) {
        ArithmeticFactory factory = new ArithmeticFactory();
        ArithmeticAdd add = (ArithmeticAdd) factory.getArithmetic("+");
        add.setA(1);
        add.setB(3);
        System.out.println(add.result());

        factory = new ArithmeticFactory();
        ArithmeticSubtraction subtraction = (ArithmeticSubtraction) factory.getArithmetic("-");
        subtraction.setA(1);
        subtraction.setB(3);
        System.out.println(subtraction.result());
    }
}
