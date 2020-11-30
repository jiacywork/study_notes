package com.jiacy.app.设计模式.行为型.观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Staff implements Observer {

    private String staffName;

    public Staff(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Subject subject = (Subject)o;
        Inform inform = (Inform)arg;
        System.out.println(this.staffName + "在" + subject.getContent() + "上接收到一个" + inform.getTitle() + ", 内容是:"+inform.getContent());
    }

}
