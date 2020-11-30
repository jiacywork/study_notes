package com.jiacy.app.设计模式.行为型.状态模式;

public class PlayState extends VideoState {

    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
