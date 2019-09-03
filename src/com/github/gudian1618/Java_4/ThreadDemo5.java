package com.github.gudian1618.Java_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/28 16:06
 * JDK1.5以后的线程池
 */
public class ThreadDemo5 {

    private static ExecutorService executorService;

    public static void main(String[] args) {
        // 创建线程池（4种）
        // 1、创建一个单线程的线程池
        ExecutorService es = Executors.newSingleThreadExecutor();

        // 2.创建固定大小的线程池
        ExecutorService es1 = Executors.newFixedThreadPool(1);

        // 3、创建一个可缓存的线程池
        ExecutorService es2 = Executors.newCachedThreadPool();

        // 4、创建一个
        ScheduledExecutorService es3 = Executors.newScheduledThreadPool(3);

        es.execute(new MyRunable6());
        es.execute(new MyRunable6());

        es1.execute(new MyRunable6());
        es1.execute(new MyRunable6());

        es2.execute(new MyRunable6());
        es2.execute(new MyRunable6());

        es3.schedule(new MyRunable6(), 3000, TimeUnit.MINUTES);

        es.shutdown();
        es1.shutdown();
        es2.shutdown();
        es3.shutdown();
    }
}

class MyRunable6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run--"+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}