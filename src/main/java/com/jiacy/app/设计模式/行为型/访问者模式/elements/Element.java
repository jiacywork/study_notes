package com.jiacy.app.设计模式.行为型.访问者模式.elements;

import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

/**
 * 定义抽象被访问对象(元素)类，定义接收访问者的方法
 */
public abstract class Element {

    public abstract void accept(Visitor visitor);

}
