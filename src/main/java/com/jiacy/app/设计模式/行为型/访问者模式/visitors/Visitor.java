package com.jiacy.app.设计模式.行为型.访问者模式.visitors;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Manelement;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Womenelement;

/**
 * 访问者，被访问者对象数据结构相对固定（即Element种类有限，且基本不会变化）
 */
public abstract class Visitor {

    public abstract void visitManElement(Manelement man);

    public abstract void visitWomenElement(Womenelement women);

}
