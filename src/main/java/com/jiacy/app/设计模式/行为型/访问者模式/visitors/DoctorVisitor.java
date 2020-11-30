package com.jiacy.app.设计模式.行为型.访问者模式.visitors;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Boy;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Girl;

public class DoctorVisitor extends Visitor {

    @Override
    public void visitManElement(Boy boy) {
        System.out.println("男孩子生病了, 医生给打针");
        boy.evaluate(this);
    }

    @Override
    public void visitWomenElement(Girl girl) {
        System.out.println("女孩子生病了, 医生给吃药");
        girl.evaluate(this);
    }

}
