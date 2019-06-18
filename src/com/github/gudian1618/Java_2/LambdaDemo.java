package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 10:59
 * @description
 * 只有一个方法的类，函数作为参数传递，或者将代码看成数据。
 */
public class LambdaDemo {
    public static void main(String[] args) {
        
        // Lambda表达式（类或者接口只有一个方法时），具体只有一句代码时，可以省略大括号的代码块。
        // 代码有多行时，需要语句块{};
        // 好处：代码简洁，不会单独生成class文件。
//        IEat ieat3 = ()->System.out.println("eat apple banana");
        // 没有参数时的使用
//        IEat ieat3 = ()-> {
//            System.out.println("eat apple banana");
//        };
//        ieat3.eat();
        
        // Lambda表达式带参数时使用,参数类型可以省略。
//        IEat ieat4 = (thing, age) -> {
//            System.out.println("eat..." + thing+"..."+age);
//            System.out.println(age);
//        };
//        ieat4.eat("apple",24);
        
        // 带返回值的方法
        IEat ieat5 = (thing, age) -> {
            System.out.println(age+"eat..."+thing);
            return 100;
        };
        ieat5.eat("pig", 12);
        
        // 带返回值的方法中只有一句实现代码时，去掉{}直接写结果值，去掉return。
    
    }
}

//// 只有一个抽象方法的接口
//interface IEat {
//    public void eat();
//}

interface IEat {
    public int eat(String thing,int age);
}

//class IEatImpl implements IEat {
//    @Override
//    public void eat(String thing, int age) {
//        System.out.println("eat apple"+thing+"..."+age);
//    }
//}