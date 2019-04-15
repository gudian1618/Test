package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/3/1 9:38
 */

/*
 * final关键字
 * 1、使用final声明一个属性，就是常量，常量的命名规则全部大写，常量必须在定义时完成初始化，或在构造器中初始化
 * 2、使用final声明一个方法，不能被子类重写，只能被子类调用
 * 3、使用final声明一个类，该类就是最终类，不能被继承
 * 4、在方法参数中使用final，该方法内部不能修改参数的值
 *
 */

public class Test7 {
    private static final int PERSION_NUMBER = 10;
    public static void main(String[] args) {
    
        System.out.println(Constant.PERSION_NUMBER);
        
        FinalClass fc = new FinalClass();
        fc.setLength(10);
    
    }
    
}

// 常量类（工具类）:在实际项目开发中，常量类通常用于定义项目中一些公共的不变的数据

final class Constant {
    public static final int PERSION_NUMBER = 10; // 人数
    public static final String SERVER_URL = "http://www.baidu.com";
}

class FinalClass {
    public final int DAY_NUMBER = 22; // 工作天数
    
    public final void print() {
        System.out.println("我是final方法");
    }
    
    public void setLength(final int size) {
        
        System.out.println(size);
    }
}

class SubClass extends FinalClass {
//    public void print() {
//        System.out.println();
//    }

}
