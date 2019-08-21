package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/21 11:13
 * join方法：
 * 加入线程，让调用的线程先执行指定时间或执行完毕，而后再继续其他线程的运行
 */
public class ThreadDemo2 {
    
    public static void main(String[] args) {
        
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t = new Thread(mr2);
        t.start();
        
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "==" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 20) {
                try {
                    t.join(); // 让t线程执行完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
