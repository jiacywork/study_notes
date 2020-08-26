package com.jiacy.app.设计模式.创建型.建造者模式.director;

import com.jiacy.app.设计模式.创建型.建造者模式.builder.AbstractBuilder;

/**
 * 指挥者，根据客户端需求构建对象
 */
public class Director {

    public void build(AbstractBuilder builder) {
        builder.setPartA();
        builder.setPartB();
    }

}
