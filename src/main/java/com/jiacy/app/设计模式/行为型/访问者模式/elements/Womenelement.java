package com.jiacy.app.设计模式.行为型.访问者模式.elements;

import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

public class Womenelement extends Element {
    @Override
    public void Visitor(Visitor visitor) {
        visitor.visitWomenElement(this);
    }

    public void operation(String visitor) {
        System.out.println("女人: " + visitor);
    }
}
