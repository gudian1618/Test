package com.github.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/3/1 10:35
 */

/**
1、很多具有相同特征和行为的对象可以抽象为一个类，很多具有相同特征和行为的类可以抽象为一个抽象类
2、使用abstract关键字声明的类为抽象类
3、抽象类无法实例化

 抽象类的规则：
 1、抽象类可以没有抽象方法，有抽象方法的类必须为抽象类
 2、非抽象类继承抽象类必须实现所有的抽象方法
 3、抽象类可以继承抽象类、可以不实现父类抽象类
 4、抽象类可以有方法实现和属性
 5、抽象类不能被实例化
 6、抽象类不能声明为final
 7、抽象类可以有构造方法


 */

public class Test8 {
    
    public static void main(String[] args) {
        Man man = new Man();
        man.move();
        man.eat();
        
        Woman woman = new Woman();
        woman.move();
        woman.eat();
    
    }
}

abstract class Animal1 {
    public abstract void move(); // 方法的声明，抽象方法只有声明，没有实现
}

abstract class Person extends Animal1 {
    public abstract void eat();
    public void sleep() {
        System.out.println("睡觉");
    }
}

// 继承抽象类的具体类必须实现所有抽象方法
class Man extends Person {
    @Override
    public void move() {
        System.out.println("我是男人，我爱跑步");
    }
    
    @Override
    public void eat() {
        System.out.println("我是男人，我爱吃肉");
    }
}

class Woman extends Person {
    @Override
    public void move() {
        System.out.println("我是女人，我爱健身");
    }
    
    @Override
    public void eat() {
        System.out.println("我是女人，我爱吃水果");
    }
}







