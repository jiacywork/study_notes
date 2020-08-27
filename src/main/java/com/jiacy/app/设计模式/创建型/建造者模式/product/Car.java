package com.jiacy.app.设计模式.创建型.建造者模式.product;

/**
 * 建造者以静态内部类形式实现
 *
 * 将需要建造的实体类和实体类的建造者创建在一个类中
 */
public class Car {
    // 实体类属性
    private String tyre;
    private String carriage;
    private String wheel;

    public Car(CarBuilder builder) {
        this.tyre = builder.tyre;
        this.carriage = builder.carriage;
        this.wheel = builder.wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyre='" + tyre + '\'' +
                ", carriage='" + carriage + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }

    /**
     * 建造者为实体类的静态内部类，核心是链式调用
     */
    public static class CarBuilder {
        // 和实体类属性保持一致
        private String tyre;
        private String carriage;
        private String wheel;

        // 使用链式调用方式传值
        public CarBuilder buildTyre(String tyre) {
            this.tyre = tyre;
            return this;
        }

        public CarBuilder buildCarriage(String carriage) {
            this.carriage = carriage;
            return this;
        }

        public CarBuilder buildWhell(String wheel) {
            this.wheel = wheel;
            return this;
        }

        // 调用实体的构造方法，用于将属性值传递到实体类
        public Car build() {
            return new Car(this);
        }

    }

}
