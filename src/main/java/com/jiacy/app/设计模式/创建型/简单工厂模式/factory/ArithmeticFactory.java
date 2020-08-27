package com.jiacy.app.设计模式.创建型.简单工厂模式.factory;

import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.Arithmetic;
import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticAdd;
import com.jiacy.app.设计模式.创建型.简单工厂模式.arithmetic.ArithmeticSubtraction;

public class ArithmeticFactory {

    // 常规简单工厂模式
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

    // 优化方案：使用反射，关闭工厂类修改，使满足开闭原则
    public Arithmetic getArithmetic(Class clazz) {
        Arithmetic arithmetic = null;
        try {
            arithmetic = (Arithmetic) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return arithmetic;
    }

}
