package com.xinaml.cloud.zuul.thread;

public class Shop {
    private int id;

    public Shop(int id) {
        this.id = id;
    }

    public String toString() {// 重写toString方法
        return "产品：" + this.id;
    }
}
