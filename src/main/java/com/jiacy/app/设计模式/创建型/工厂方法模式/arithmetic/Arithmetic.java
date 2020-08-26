package com.jiacy.app.设计模式.创建型.工厂方法模式.arithmetic;

/**
 * 算法
 */
public abstract class Arithmetic {

    protected double a;
    protected double b;

    public abstract double result();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
