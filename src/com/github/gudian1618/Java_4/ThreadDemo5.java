package com.github.gudian1618.Java_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/28 16:06
 * JDK1.5以后的线程池
 */
public class ThreadDemo5 {

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.execute(new MyRunable6());
        es.execute(new MyRunable6());
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