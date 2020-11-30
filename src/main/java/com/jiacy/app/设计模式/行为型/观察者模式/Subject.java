package com.jiacy.app.设计模式.行为型.观察者模式;

import java.util.Observable;

public class Subject extends Observable {

    private String content;

    public Subject(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void issueInform(Inform inform){
        System.out.println(inform.getTitle() + "发布在" + content + "上");
        setChanged();
        notifyObservers(inform);
    }

}
