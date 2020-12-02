package com.jiacy.app.设计模式.行为型.访问者模式.elements;

import com.jiacy.app.设计模式.行为型.访问者模式.visitors.DoctorVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.TeacherVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

public class Boy extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBoyElement(this);
    }

    /**
     * 可扩展自定义行为
     * @param visitor
     */
    public void evaluate(Visitor visitor) {
        if (visitor instanceof DoctorVisitor)
            System.out.println("打针真疼");
        else if (visitor instanceof TeacherVisitor)
            System.out.println("真开心");
    }

}
