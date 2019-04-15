package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/4/11 15:54
 */

/**
 * 接口就是一个标准、一个规范，没有具体的实现
 * 接口需要被具体的子类实现才有意义
 * 接口的名称首字母大写I外加后续名称
 * 接口只能定义抽象的方法，不能具体实现
 * 使用接口可以让我们的程序更加利于变化
 * 面向对象涉及法则：基于接口编程
 * 类只能单继承，接口可以多继承
 *
 *
 * 接口只能定义抽象方法和常量
 * 接口可以继承多个接口 extends xx,xx
 * 一个具体类实现接口用implements
 * 一个类可以实现多个接口
 * 抽象类实现接口可以不实现接口的方法
 * 在接口中定义的方法没有声明，默认为public
 * 接口不能有构造方法
 *
 * 接口的定义格式：
 * interface 接口名称{
 *     全局变量；
 *     抽象方法；
 * }
 *
 * 面向对象的设计原则：
 * 1、对修改关闭、对扩展开放
 * 2、面向接口编程
 *
 */

public class Test9 {
    public static void main(String[] args) {
        Girl mm = new Girl("玛丽");
        mm.sleep();
        mm.eat();
        mm.run();
    }
}

interface IEat {
//    public abstract void eat();// 接口中只能定义抽象方法
    void eat(); // 接口中定义的方法没有声明修饰符，默认为public abstract
//    public static final int NUM = 10;   //在接口中定义一个常量
    int NUM = 10;// 默认简写
    // JDK1.8以后新特性，可以被所有实现类继承
    public default void print() {
        System.out.println("eat");
    }
}

interface IRun {
    void run();
}

interface ISleep extends IEat, IRun {
    void sleep();
}

// 实现接口必须实现接口的所有方法
class Girl implements ISleep, IEat {
    private String name;
    
    public Girl(String name) {
        this.name = name;
    }
    
    @Override
    public void sleep() {
        System.out.println("我爱睡觉");
    };
    
    @Override
    public void eat() {
        System.out.println("我是"+name+"，我爱吃猪脚");
    }
    
    @Override
    public void run() {
        System.out.println("吃完就跑");
    }
}
