package com.jiacy.app.设计模式.行为型.责任链模式;

public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void handler(RequestForLeave request);

}
