package com.jiacy.app.设计模式.行为型.访问者模式;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Element;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Element数据结构,元素需要相对固定，且可遍历
 */
public class ElementStruct {
    private static final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    public void operation(Visitor visitor) {
        for (Element element: elements) {
            element.Visitor(visitor);
        }
    }

}
