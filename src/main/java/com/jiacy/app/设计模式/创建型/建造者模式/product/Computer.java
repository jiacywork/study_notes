package com.jiacy.app.设计模式.创建型.建造者模式.product;

/**
 * 被建造对象（电脑）
 */
public class Computer {

    private String zb; // 主板
    private String cpu; //CPU
    private String nc; //内存
    private String xk; //显卡

    public String getZb() {
        return zb;
    }

    public void setZb(String zb) {
        this.zb = zb;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getXk() {
        return xk;
    }

    public void setXk(String xk) {
        this.xk = xk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "zb='" + zb + '\'' +
                ", cpu='" + cpu + '\'' +
                ", nc='" + nc + '\'' +
                ", xk='" + xk + '\'' +
                '}';
    }
}
