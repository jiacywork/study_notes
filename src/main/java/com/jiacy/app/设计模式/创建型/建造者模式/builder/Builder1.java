package com.jiacy.app.设计模式.创建型.建造者模式.builder;

import com.jiacy.app.设计模式.创建型.建造者模式.product.Product;

public class Builder1 extends AbstractBuilder {
    Product product = new Product();

    @Override
    public void setPartA() {
        product.add("部件A");
    }

    @Override
    public void setPartB() {
        product.add("部件B");
    }

    @Override
    public Product build() {
        return product;
    }
}
