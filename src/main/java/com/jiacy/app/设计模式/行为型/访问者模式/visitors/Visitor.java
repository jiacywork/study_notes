package com.jiacy.app.设计模式.行为型.访问者模式.visitors;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Boy;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Girl;

/**
 * 访问者，被访问者对象数据结构相对固定（即Element种类有限，且基本不会变化）
 * 针对每类元素定义一个visit方法
 */
public abstract class Visitor {

    public abstract void visitBoyElement(Boy boy);

    public abstract void visitGirlElement(Girl girl);

}
