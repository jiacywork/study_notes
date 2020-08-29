package com.jiacy.app.设计模式.结构型.门面模式;

public class GiftPayService {

    public boolean pay(Gift gift) {
        System.out.println(gift.getName() + " 支付成功");
        return true;
    }

}
