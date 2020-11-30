package com.jiacy.app.设计模式.行为型.状态模式;

public class Client {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();
        videoContext.setVideoState(new PlayState());
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.pause();
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.speed();
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.stop();
        System.out.println("当前状态:"+videoContext.getVideoState().getClass().getSimpleName());

        videoContext.speed();
    }

}
