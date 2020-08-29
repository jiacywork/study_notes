package com.jiacy.app.设计模式.结构型.门面模式;

public class GiftTransferService {

    public String transfer(Gift gift) {
        String orderNo = "666666666";
        System.out.println(gift.getName() + " 发货成功，订单号" + orderNo);
        return orderNo;
    }

}
