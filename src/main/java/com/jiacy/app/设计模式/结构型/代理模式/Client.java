package com.jiacy.app.设计模式.结构型.代理模式;

public class Client {

    public static void main(String[] args) {
        Room room = new Room();
        room.setRoomId(301);
        room.setAddress("上丰路1111号");

//        RoomStaticProxy proxy = new RoomStaticProxy();
//        proxy.operate(room);

        AbstractRoomOwner owner = (AbstractRoomOwner) new RoomDynamicProxy(new RoomOwnerChuzhu()).getProxyInstace();
        owner.operate(room);
    }
}
