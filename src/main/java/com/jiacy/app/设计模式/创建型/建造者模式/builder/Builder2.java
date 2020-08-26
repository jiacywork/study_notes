package com.jiacy.app.设计模式.创建型.建造者模式.builder;

import com.jiacy.app.设计模式.创建型.建造者模式.product.Product;

public class Builder2 extends AbstractBuilder {
    Product product = new Product();

    @Override
    public void setPartA() {
        product.add("部件C");
    }

    @Override
    public void setPartB() {
        product.add("部件D");
    }

    @Override
    public Product build() {
        return product;
    }
}
