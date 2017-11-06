package com.xinaml.cloud.zuul.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Storage s = new Storage();

        ProviderThread p1 = new ProviderThread("生产者1",s);
        ConsumerThread c1 = new ConsumerThread("消费者1",s);
        ProviderThread p2 = new ProviderThread("生产者2",s);
        ConsumerThread c2 = new ConsumerThread("消费者2",s);
        ProviderThread p3 = new ProviderThread("生产者3",s);
        ConsumerThread c3 = new ConsumerThread("消费者3",s);
        service.submit(p1);
        service.submit(p2);
        service.submit(p3);
        service.submit(c1);
        service.submit(c2);
        service.submit(c3);
    }
}
