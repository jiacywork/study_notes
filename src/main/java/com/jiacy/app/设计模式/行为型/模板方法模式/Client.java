package com.jiacy.app.设计模式.行为型.模板方法模式;

/**
 * 将算法骨架在抽象类内实现，变化的部分在具体子类内进行实现
 *
 * 使得子类在不改变算法结构的前提下，对某些特定的步骤重定义
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ImplementClassA();
        abstractClass.method();

        abstractClass = new ImplementClassB();
        abstractClass.method();
    }

}
