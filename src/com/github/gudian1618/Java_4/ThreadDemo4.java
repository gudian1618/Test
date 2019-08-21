package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 16:40
 * 线程同步
 *
 */
public class ThreadDemo4 {
    
    public static void main(String[] args) {
    
    }
}

class MyRunnable5 implements Runnable {
    
    private int ticket = 10; // 售票
    
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if (ticket>0) {
                System.out.println("您能够买的票剩余");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

