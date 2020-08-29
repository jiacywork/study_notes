package com.jiacy.app.设计模式.结构型.门面模式;

/**
 * 封装子系统的多个接口，提供统一接口
 */
public class Client {

    public static void main(String[] args) {
        Gift gift = new Gift();
        gift.setCount(1);
        gift.setName("项链");

        GiftBuyService giftBuyService = new GiftBuyService();
        giftBuyService.buy(gift);
    }
}
