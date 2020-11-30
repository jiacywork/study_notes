package com.jiacy.app.设计模式.结构型.享元模式;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AbstractObject object1 = FlyweightFactory.getObject(ConcreteObject1.class.getName());
        System.out.println(object1.hashCode());
        AbstractObject object2 = FlyweightFactory.getObject(ConcreteObject2.class.getName());
        System.out.println(object2.hashCode());

        AbstractObject object3 = FlyweightFactory.getObject(ConcreteObject1.class.getName());
        System.out.println(object3.hashCode());
        AbstractObject object4 = FlyweightFactory.getObject(ConcreteObject2.class.getName());
        System.out.println(object4.hashCode());
    }
}
