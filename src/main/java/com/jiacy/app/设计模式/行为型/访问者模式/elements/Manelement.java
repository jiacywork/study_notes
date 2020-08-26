package com.jiacy.app.设计模式.行为型.访问者模式.elements;

import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

public class Manelement extends Element {
    @Override
    public void Visitor(Visitor visitor) {
        visitor.visitManElement(this);
    }

    public void operation(String visitor) {
        System.out.println("男人: " + visitor);
    }
}
