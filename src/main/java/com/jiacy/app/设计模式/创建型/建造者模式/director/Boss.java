package com.jiacy.app.设计模式.创建型.建造者模式.director;

import com.jiacy.app.设计模式.创建型.建造者模式.builder.AbstractComputerBuilder;
import com.jiacy.app.设计模式.创建型.建造者模式.product.Computer;

/**
 * 指挥者（电脑店老板）
 */
public class Boss {

    private AbstractComputerBuilder builder;

    public void setBuilder(AbstractComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer build(String zb, String cpu, String nc, String xk) {
        this.builder.buildZb(zb);
        this.builder.buildCpu(cpu);
        this.builder.buildNc(nc);
        this.builder.buildXk(xk);
        return this.builder.build();
    }

}
