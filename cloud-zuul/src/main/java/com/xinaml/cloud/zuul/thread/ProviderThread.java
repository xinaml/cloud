package com.xinaml.cloud.zuul.thread;

public class ProviderThread implements  Runnable {
    private String name;
    private Storage s = null;

    public ProviderThread(String name, Storage s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        try {
            while (true) {
                Shop product = new Shop((int) (Math.random() * 10000)); // 产生0~9999随机整数
                s.push(product);
                System.out.println(name + "已生产(" + product.toString() + ").");
                Thread.sleep(500);
            }
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

    }
}
