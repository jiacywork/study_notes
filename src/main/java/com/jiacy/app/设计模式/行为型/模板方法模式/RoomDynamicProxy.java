package com.jiacy.app.设计模式.行为型.模板方法模式;

public class RoomDynamicProxy extends AbstractProxy {

    public RoomDynamicProxy(AbstractRoomOwner roomOwner) {
        super(roomOwner);
    }

    @Override
    protected void before(Room room) {
        System.out.println("动态-草拟合同1：" + room.getRoomId());
    }

    @Override
    protected void after(Room room) {
        System.out.println("动态-缴费1："+ room.getRoomId());
    }
}
