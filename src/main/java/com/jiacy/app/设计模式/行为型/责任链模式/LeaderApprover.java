package com.jiacy.app.设计模式.行为型.责任链模式;

import org.springframework.util.StringUtils;

public class LeaderApprover extends Approver {

    @Override
    public void handler(RequestForLeave request) {
        if(!StringUtils.isEmpty(request.getContent())) {
            System.out.println(request.getName() + "请假信息批准");
            if(approver != null)
                approver.handler(request);
        } else {
            System.out.println(request.getName() + "请假不批准,流程结束");
            return;
        }
    }

}
