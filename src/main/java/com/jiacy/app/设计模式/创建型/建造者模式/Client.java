package com.jiacy.app.设计模式.创建型.建造者模式;

import com.jiacy.app.设计模式.创建型.建造者模式.builder.*;
import com.jiacy.app.设计模式.创建型.建造者模式.director.Boss;
import com.jiacy.app.设计模式.创建型.建造者模式.director.Director;
import com.jiacy.app.设计模式.创建型.建造者模式.product.Car;
import com.jiacy.app.设计模式.创建型.建造者模式.product.Computer;
import com.jiacy.app.设计模式.创建型.建造者模式.product.Product;

/**
 * 关注方法的调用顺序，创建对象步骤较多
 *
 * 适用于创建对象的复杂算法应该和该对象的组成部分以及他们的装配方式相互独立时
 */
public class Client {

    public static void main(String[] args) {
        // 示例一
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

        // 示例二，写法一
        AbstractComputerBuilder builder = new ConcreteComputerBuilder();
        Boss boss = new Boss();
        boss.setBuilder(builder);
        Computer computer = boss.build("华硕主板","英特尔酷睿CPU", "海盗船内存", "英伟达显卡");
        System.out.println(computer);

        // 示例二，写法二
        Car car = new Car.CarBuilder().buildTyre("奔驰轮胎").buildCarriage("宝马车厢").buildWhell("奥迪车轮").build();
        System.out.println(car);
    }

}
