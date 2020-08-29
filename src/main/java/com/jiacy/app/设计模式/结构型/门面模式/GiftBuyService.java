package com.jiacy.app.设计模式.结构型.门面模式;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.springframework.util.StringUtils;

public class GiftBuyService {

    private GiftValidateService giftValidateService = new GiftValidateService();
    private GiftPayService giftPayService = new GiftPayService();
    private GiftTransferService giftTransferService = new GiftTransferService();

    public boolean buy(Gift gift) {
        System.out.println("开始下单：" + gift.getName());
        if (!giftValidateService.validate(gift) || !giftPayService.pay(gift))
            return false;
        String orderNo = giftTransferService.transfer(gift);
        if (!StringUtils.isEmpty(orderNo)) {
            System.out.println("下单成功");
            return true;
        } else {
            System.out.println("下单失败");
            return false;
        }
    }
}
