package com.jiacy.app.设计模式.行为型.状态模式;

public abstract class VideoState {

    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
