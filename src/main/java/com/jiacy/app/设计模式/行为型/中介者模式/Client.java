package com.jiacy.app.设计模式.行为型.中介者模式;

public class Client {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1();
        Colleague c2 = new ConcreteColleague2();
        Colleague c3 = new ConcreteColleague3();
        md.register(c1);
        md.register(c2);
        md.register(c3);

        c1.send();
//        System.out.println("-------------");
//        c2.send();
    }

}
