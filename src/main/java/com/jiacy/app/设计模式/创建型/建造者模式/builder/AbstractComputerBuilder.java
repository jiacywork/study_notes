package com.jiacy.app.设计模式.创建型.建造者模式.builder;

import com.jiacy.app.设计模式.创建型.建造者模式.product.Computer;

/**
 * 抽象的电脑建造者
 */
public abstract class AbstractComputerBuilder {

    public abstract void buildZb(String zb);
    public abstract void buildCpu(String cpu);
    public abstract void buildNc(String nc);
    public abstract void buildXk(String xk);

    public abstract Computer build();
}
