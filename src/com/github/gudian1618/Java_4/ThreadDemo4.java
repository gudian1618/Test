package com.github.gudian1618.Java_4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 16:40
 * 线程同步
 * 1、多线程共享数据时，会发生线程不安全的情况
 * 2、多线程共享数据必需使用同步来解决
 * 同步的实现方法：
 * 1、同步代码块
 * 2、同步方法
 * 3、使用Lock（更灵活的代码控制）
 * 多线程共享数据，会有安全问题，使用同步可以解决安全问题，但同时会牺牲性能，
 * 所以同步代码块要尽量保持简洁，把不随数据变化的相关代码移除同步，不要阻塞。
 * 同步准则：
 * 1、使代码块保持简洁，把不随线程变化的预处理和后处理移除synchronized。
 * 2、不要阻塞，如InputStream.read()
 * 3、在持有锁的时候，不要对其他对象调用方法。
 */
public class ThreadDemo4 {
    
    public static void main(String[] args) {
        // 模拟两个线程，即两个窗口买票
        MyRunnable5 mr5 = new MyRunnable5();
        
        Thread t1 = new Thread(mr5);
        Thread t2 = new Thread(mr5);
        Thread t3 = new Thread(mr5);
        
        t1.start();
        t2.start();
        t3.start();

    }
}

class MyRunnable5 implements Runnable {
    
    private int ticket = 20; // 售票
//    private Object obj = new Object(); // 同步锁
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            synchronized (this) { // 同步锁
//                if (ticket >0) {
//                    --ticket;
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("您购买的票剩余" + ticket + "张");
//                }
//            }
//            method();
            method2();
        }
    }

    // 同步方法
    private synchronized void method() {
        synchronized (this) { // 同步锁
            if (ticket >0) {
                --ticket;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("您购买的票剩余" + ticket + "张");
            }
        }
    }

    // 互斥锁
    ReentrantLock lock = new ReentrantLock();
    // Lock实现同步
    private void method2() {
        // 锁
        lock.lock();
        if (ticket >0) {
            --ticket;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("您购买的票剩余" + ticket + "张");
        }
        // 释放锁
        lock.unlock();
    }

}
