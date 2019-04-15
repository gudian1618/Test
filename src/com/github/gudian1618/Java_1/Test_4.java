package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @description
 * @create 2019-04-13 16:51
 *
 * 适配器模式：一个类的接口转换成客户希望的另外一个接口。
 * 该模式使得原本由于接口不兼容而不能一起工作的那些累可以一起工作。
 * 而且不改变原有的接口，将新的接口放到适配器里，用适配器调用原有的接口的类的方法，使得新的接口能够在不改变原有接口的情况下使用原有接口对应的类的方法
 *
 * oo设计原则：
 * 面向抽象编程
 * 封装变化
 * 多用组合，少用继承
 * 对修改关闭、对扩展开放
 *
 */


public class Test_4 {
    public static void main(String[] args) {
        IPowerA powerA = new PowerAImpl();
        work(powerA);

        IPowerB powerB = new PowerBImpl();
//        work(powerB);
        Adapter adapter = new Adapter(powerB);
        work(adapter);
    }

    public static void work(IPowerA a) {
        System.out.println("正在连接...");
        a.insert();
        System.out.println("工作结束。");
    }
}

interface Animal {
    public void sing();
    public void cry();
    public void run();
    public void swim();
}

// 适配器（用抽象类空实现）-用抽象类空实现接口的所有方法，便于子类继承实现所有方法
// 所以建议接口里面的方法尽可能地相关联，并且精简
abstract class AnimalFunction implements Animal{
    public void sing() {}
    public void cry() {}
    public void run() {}
    public void swim() {}
}

class Dog extends AnimalFunction {
    public void run() {
        System.out.println("我是疯狗，我爱跑！");
    }
}

// 适配器（用一般的类重写一个方法，方法名是外部想要调用的接口方法名，方法内部实现是另一个接口的方法，起到转换器的作用）-重点
class Adapter implements IPowerA {
    private IPowerB powerB;
    public Adapter(IPowerB powerB) {
        this.powerB = powerB;
    }
    public void insert() {
        powerB.connect();
    }
}


interface IPowerA {
    public void insert();
}

class PowerAImpl implements IPowerA {
    public void insert() {
        System.out.println("电源A开始工作");
    }
}

interface IPowerB {
    public void connect();
}

class PowerBImpl implements IPowerB {
    public void connect() {
        System.out.println("电源B开始工作");
    }
}

