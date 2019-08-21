package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 10:09
 */
public class ThreadDemo1 {
    
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start(); // 启动线程
    }
}


/**
 * 实现线程的第一种方式：继承Thread类
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}