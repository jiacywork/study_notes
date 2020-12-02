package com.jiacy.app.设计模式.行为型.访问者模式.elements;

import com.jiacy.app.设计模式.行为型.访问者模式.visitors.DoctorVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.TeacherVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

public class Girl extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGirlElement(this);
    }

    public void evaluate(Visitor visitor) {
        if (visitor instanceof DoctorVisitor)
            System.out.println("药真苦");
        else if (visitor instanceof TeacherVisitor)
            System.out.println("真累");
    }

}
