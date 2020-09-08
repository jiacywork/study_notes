package com.jiacy.app.设计模式.结构型.适配器模式.demo;

/**
 * 5V 直流电
 */
public class ConcreteDC extends DC {

    @Override
    public int transfer() {
        return 5;
    }

}
