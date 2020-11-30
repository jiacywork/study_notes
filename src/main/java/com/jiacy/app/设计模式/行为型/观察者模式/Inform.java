package com.jiacy.app.设计模式.行为型.观察者模式;

public class Inform {

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
