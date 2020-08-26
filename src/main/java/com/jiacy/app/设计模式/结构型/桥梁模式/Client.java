package com.jiacy.app.设计模式.结构型.桥梁模式;

import com.jiacy.app.设计模式.结构型.桥梁模式.abs.AbstractClass;
import com.jiacy.app.设计模式.结构型.桥梁模式.abs.AbstractClassConcreteA;
import com.jiacy.app.设计模式.结构型.桥梁模式.abs.AbstractClassConcreteB;
import com.jiacy.app.设计模式.结构型.桥梁模式.implement.ImplementClassConcreteA;
import com.jiacy.app.设计模式.结构型.桥梁模式.implement.ImplementClassConcreteB;

/**
 * 又叫桥接模式，将实现和抽象解耦，使两者可以独立变化
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClassConcreteA();
        abstractClass.setImplementClass(new ImplementClassConcreteA());
        abstractClass.operation();
        abstractClass.setImplementClass(new ImplementClassConcreteB());
        abstractClass.operation();

        System.out.println("");
        abstractClass = new AbstractClassConcreteB();
        abstractClass.setImplementClass(new ImplementClassConcreteA());
        abstractClass.operation();
        abstractClass.setImplementClass(new ImplementClassConcreteB());
        abstractClass.operation();
    }

}
