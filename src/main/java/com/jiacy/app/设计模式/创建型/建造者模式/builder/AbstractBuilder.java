package com.jiacy.app.设计模式.创建型.建造者模式.builder;

import com.jiacy.app.设计模式.创建型.建造者模式.product.Product;

public abstract class AbstractBuilder {

    // 声明产品组成部分，并提供返回构建产品的方法
    public abstract void setPartA();
    public abstract void setPartB();
    public abstract Product build();
}
