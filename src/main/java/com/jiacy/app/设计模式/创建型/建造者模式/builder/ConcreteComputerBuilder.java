package com.jiacy.app.设计模式.创建型.建造者模式.builder;

import com.jiacy.app.设计模式.创建型.建造者模式.product.Computer;

/**
 * 实际电脑建造者（装机小哥）
 */
public class ConcreteComputerBuilder extends AbstractComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void buildZb(String zb) {
        computer.setZb(zb);
    }

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildNc(String nc) {
        computer.setNc(nc);
    }

    @Override
    public void buildXk(String xk) {
        computer.setXk(xk);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
