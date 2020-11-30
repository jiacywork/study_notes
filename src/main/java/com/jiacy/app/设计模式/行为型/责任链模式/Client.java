package com.jiacy.app.设计模式.行为型.责任链模式;

public class Client {

    public static void main(String[] args) {
        Approver leaderApprover = new LeaderApprover();
        Approver managerApprover = new ManagerApprover();
        leaderApprover.setNextApprover(managerApprover);

        RequestForLeave request = new RequestForLeave();
        request.setName("李响");
        request.setTime("20201201");
        request.setContent("献血");
        leaderApprover.handler(request);
    }

}
