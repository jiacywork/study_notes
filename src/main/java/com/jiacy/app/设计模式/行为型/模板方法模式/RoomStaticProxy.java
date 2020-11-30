package com.jiacy.app.设计模式.行为型.模板方法模式;

public class RoomStaticProxy implements AbstractRoomOwner {

    private AbstractRoomOwner roomOwner = new RoomOwnerChuzhu();

    private void before(Room room) {
        System.out.println("草拟合同：" + room.getRoomId());
    }

    @Override
    public int operate(Room room) {
        before(room);
        int temp = roomOwner.operate(room);
        after(room);
        return temp;
    }

    private void after(Room room) {
        System.out.println("缴费："+ room.getRoomId());
    }

}
