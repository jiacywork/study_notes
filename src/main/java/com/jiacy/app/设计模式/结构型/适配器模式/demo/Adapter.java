package com.jiacy.app.设计模式.结构型.适配器模式.demo;

/**
 * 将220V交流电适配为5V直流电
 */
public class Adapter extends DC {

    private AC ac = new AC();

    @Override
    public int transfer() {
        System.out.println("开始电压转换");
        int value = ac.use();
        return value / 44;
    }

}
