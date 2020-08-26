package com.jiacy.app.设计模式.创建型.建造者模式;

import com.jiacy.app.设计模式.创建型.建造者模式.builder.AbstractBuilder;
import com.jiacy.app.设计模式.创建型.建造者模式.builder.Builder1;
import com.jiacy.app.设计模式.创建型.建造者模式.builder.Builder2;
import com.jiacy.app.设计模式.创建型.建造者模式.director.Director;
import com.jiacy.app.设计模式.创建型.建造者模式.product.Product;

/**
 * 关注方法的调用顺序，创建对象步骤较多
 *
 * 适用于创建对象的复杂算法应该和该对象的组成部分以及他们的装配方式相互独立时
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("构建对象1：");
        AbstractBuilder builder1 = new Builder1();
        director.build(builder1);
        Product product = builder1.build();
        product.show();

        System.out.println("构建对象2：");
        AbstractBuilder builder2 = new Builder2();
        director.build(builder2);
        product = builder2.build();
        product.show();
    }

}
