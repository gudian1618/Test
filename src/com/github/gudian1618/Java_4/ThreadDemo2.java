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
//                try {
//                    t.join(); // 让t线程执行完毕
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                t.interrupt(); // 中断线程,只是做了中断标记
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (Thread.interrupted()) {
                // 测试中断状态，此方法会把中断状态清除
                break;
            }
            System.out.println(Thread.currentThread().getName() + "--" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}

class MyRunnable3 implements Runnable {
    public boolean flag=true;
    
    public MyRunnable3(boolean flag) {
        this.flag = flag;
    }
    
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
