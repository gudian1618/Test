package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 15:15
 * 守护线程
 */
public class ThreadDemo3 {
    
    public static void main(String[] args) {
        MyRunnable4 mr4 = new MyRunnable4();
        Thread t4 = new Thread(mr4);
        t4.start();
        
        for (int i = 0; i < 50; i++) {
            System.out.println("main-" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("---" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}