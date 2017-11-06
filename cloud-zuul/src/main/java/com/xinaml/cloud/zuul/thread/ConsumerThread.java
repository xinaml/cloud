package com.xinaml.cloud.zuul.thread;

public class ConsumerThread implements  Runnable {
    private String name;
    private Storage s = null;

    public ConsumerThread(String name, Storage s) {
        this.name = name;
        this.s = s;
    }

    public void run() {
        try {
            while (true) {
                Shop shop = s.pop();
                System.out.println(name + "已消费(" + shop.toString() + ").");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
