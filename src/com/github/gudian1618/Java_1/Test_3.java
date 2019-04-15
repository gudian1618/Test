package com.github.gudian1618.Java_1; /**
 * @param
 * @author gudian1618
 * @version 1.0
 * @description
 * @create 2019-04-13 12:59
 */

/**
 * 静态代理模式（proxy）：为了其他对象提供一种代理以控制这个对象的访问
 * “真时对象”的代表，在访问对象时引入一定程度的间接性
 * 这种间接性可以附加多种用途
 *
 */

public class Test_3 {
    public static void main(String[] args) {
        Action userAction = new UserAction();
        ActionProxy proxy = new ActionProxy(userAction);
        proxy.doAction();
    }
}

class ActionProxy implements Action {
    // 被代理的对象
    private Action target;
    public ActionProxy(Action target) {
        this.target = target;
    }

    // 执行操作，函数方法
    @Override
    public void doAction() {
        long startTime = System.currentTimeMillis();
        // 执行真正的业务
        target.doAction();
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时："+(endTime-startTime));
    }
}

interface Action {
    public void doAction();
}

class UserAction implements Action {
    @Override
    public void doAction() {
        for (int i=0; i<10; i++) {
            System.out.println("用户开始工作... ");
        }
    }
}
