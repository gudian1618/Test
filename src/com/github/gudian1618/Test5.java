package com.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/2/22 11:04
 */

public class Test5 {
    public static void main(String[] args) {
        
        HomeDog homeDog = new HomeDog("西贝柳丝");
        homeDog.print();
        homeDog.eat();
        HuskyDog huskyDog = new HuskyDog();
        huskyDog.eat();
        
        
    }
    
}

class Dog1 {
//    private String name;
//    private String sex;
    protected String name;
    private String sex;
    
    public Dog1() {
        System.out.println("我是Dog1的默认构造方法");
    }
    
    public Dog1(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("我是Dog1的构造方法");
    }
    
    public void eat() {
        System.out.println("吃饭");
    }
}

class HomeDog extends Dog1 {
//    public HomeDog() {
//        System.out.println("我是HomeDog的构造方法");
//    }
    
    public HomeDog(String name) {
        super(name, "公");
        System.out.println("我是HomeDog的构造方法");
    }
    
    public void print() {
        System.out.println("我是一只家狗");
    }
    
    @Override
    // 重写父类的方法
    public void eat() {
//        super.eat();
        System.out.println("我是家狗，我喜欢吃骨头");
    }
}

class HuskyDog extends Dog1 {
    public HuskyDog() {
        System.out.println("我是哈士奇的构造方法");
    }
    public void show() {
        System.out.println("我是哈士奇，我能跳舞");
    }
    
    @Override
    public void eat() {
        super.eat();
        System.out.println("我是husky，我喜欢吃鸡肝");
    }
}