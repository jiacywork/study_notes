package com.jiacy.app.设计模式.行为型.访问者模式.visitors;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Manelement;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Womenelement;

public class DoctorVisitor extends Visitor {
    @Override
    public void visitManElement(Manelement man) {
        man.operation("医生");
    }

    @Override
    public void visitWomenElement(Womenelement women) {
        women.operation("医生");
    }
}
