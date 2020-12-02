package com.jiacy.app.设计模式.行为型.访问者模式.visitors;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Boy;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Girl;

public class TeacherVisitor extends Visitor {

    @Override
    public void visitBoyElement(Boy boy) {
        System.out.println("体育课上，老师让男孩踢足球");
        boy.evaluate(this);
    }

    @Override
    public void visitGirlElement(Girl girl) {
        System.out.println("体育课上，老师让女孩踢毽子");
    }

}
