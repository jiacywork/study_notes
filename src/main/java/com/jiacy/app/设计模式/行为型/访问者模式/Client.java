package com.jiacy.app.设计模式.行为型.访问者模式;

import com.jiacy.app.设计模式.行为型.访问者模式.elements.Manelement;
import com.jiacy.app.设计模式.行为型.访问者模式.elements.Womenelement;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.DoctorVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.TeacherVisitor;
import com.jiacy.app.设计模式.行为型.访问者模式.visitors.Visitor;

/**
 * 封装一些作用在某种数据结构中的各元素操作，可以在不改变数据结构的前提下定义作用于这些元素的新操作
 */
public class Client {

    public static void main(String[] args) {
        // 初始化对象数据结构
        ElementStruct struct = new ElementStruct();
        struct.add(new Womenelement());
        struct.add(new Manelement());

        // 创建访问者
        Visitor visitor = new DoctorVisitor();
        struct.operation(visitor);

        visitor = new TeacherVisitor();
        struct.operation(visitor);
    }
}
