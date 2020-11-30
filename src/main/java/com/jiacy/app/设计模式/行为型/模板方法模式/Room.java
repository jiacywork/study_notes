package com.jiacy.app.设计模式.行为型.模板方法模式;

public class Room {

    private int roomId;
    private String address;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", address='" + address + '\'' +
                '}';
    }
}
