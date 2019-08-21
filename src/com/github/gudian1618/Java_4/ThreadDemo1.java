package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 10:09
 * 由于Intel的I7处理器支持超线程，所以两个线程在单核内是并行超线程执行。
 * 而不支持超线程的处理器，只能通过多核来解决，多余的线程通过并发。
 */
public class ThreadDemo1 {
    
    public static void main(String[] args) {
        
        MyThread mt = new MyThread(); // 直接一个线程，固定的（只能是继承类，单继承）
        mt.start(); // 启动线程
        
        // 推荐Runnable接口
        MyRunnable mr = new MyRunnable(); // 先生成一个现成的任务方法的类，而后再用线程类装这个线程的任务方法，可以将该线程任务放入到不同的线程里，并且可以实现多继承（因为是接口可以实现多继承），相对比较灵活
        Thread t2 = new Thread(mr);
        t2.start();
    }
}

/**
 * 实现线程的第一种方式：继承Thread类
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}

/**
 * 实现接口的第二种方式，实现Runnable接口
 */
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}