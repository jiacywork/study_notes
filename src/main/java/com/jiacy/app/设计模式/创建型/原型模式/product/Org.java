package com.jiacy.app.设计模式.创建型.原型模式.product;

public class Org {

    private int orgId;
    private String orgName;

    public Org(int orgId, String orgName) {
        this.orgId = orgId;
        this.orgName = orgName;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String toString() {
        return "Org{" +
                "orgId=" + orgId +
                ", orgName='" + orgName + '\'' +
                '}';
    }
}
