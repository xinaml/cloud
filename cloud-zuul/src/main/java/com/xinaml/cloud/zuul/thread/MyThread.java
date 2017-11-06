package com.xinaml.cloud.zuul.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread implements Runnable {


    private int num = 10;            //总共票数设定为5张

    @Override
    public void run() {
        while (this.num > 0) {
            consumer();
        }
    }

    public synchronized void consumer() {
        //使用同步代码块
        try {
            Thread.sleep(100);    //休息300毫秒
            if (this.num > 0) {
                //打印买票信息
                System.out.println(Thread.currentThread().getName() + "买票: " + this.num--);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MyThread ticketThread = new MyThread();
        new Thread(ticketThread, "售票口一").start();    //线程一
        new Thread(ticketThread, "售票口二").start();    //线程二
        new Thread(ticketThread, "售票口三").start();    //线程三

    }
}
