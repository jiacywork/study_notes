package com.jiacy.app.设计模式.结构型.门面模式;

public class GiftValidateService {

    /**
     * 校验库存
     * @param gift
     * @return
     */
    public boolean validate(Gift gift) {
        if (gift.getCount() > 0) {
            System.out.println(gift.getName() + " 库存校验成功");
            return true;
        } else {
            System.out.println(gift.getName() + " 库存校验失败");
            return false;
        }
    }

}
