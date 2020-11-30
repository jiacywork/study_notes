package com.jiacy.app.设计模式.行为型.观察者模式;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject("门户网站");
        subject.addObserver(new Staff("李响"));
        subject.addObserver(new Staff("徐浩岚"));

        Inform inform = new Inform();
        inform.setTitle("放假通知");
        inform.setContent("10.01~10.08放假");
        subject.issueInform(inform);
    }

}
