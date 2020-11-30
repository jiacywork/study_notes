package com.jiacy.app.设计模式.结构型.代理模式;

public class RoomOwnerChuzhu implements AbstractRoomOwner {
    @Override
    public int operate(Room room) {
        System.out.println("房屋已出租：" + room.getRoomId());
        return room.getRoomId();
    }
}
