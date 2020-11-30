package com.jiacy.app.设计模式.行为型.状态模式;

public class VideoContext {

    private VideoState videoState;
    public static final PlayState PLAY_STATE = new PlayState();
    public static final StopState STOP_STATE = new StopState();
    public static final PauseState PAUSE_STATE = new PauseState();
    public static final SpeedState SPEED_STATE = new SpeedState();

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState courseVideoState) {
        this.videoState = courseVideoState;
        this.videoState.setVideoContext(this);
    }

    public void play(){
        this.videoState.play();
    }

    public void speed(){
        this.videoState.speed();
    }

    public void stop(){
        this.videoState.stop();
    }

    public void pause(){
        this.videoState.pause();
    }
}
