package com.xinaml.cloud.zuul.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storage {
    BlockingQueue<Shop> queues = new LinkedBlockingQueue<Shop>(10);

    /**
     * 生产
     *
     * @param p
     *            产品
     * @throws InterruptedException
     */
    public void push(Shop p) throws InterruptedException {
        queues.put(p);
    }

    /**
     * 消费
     *
     * @return 产品
     * @throws InterruptedException
     */
    public Shop pop() throws InterruptedException {
        return queues.take();
    }
}
