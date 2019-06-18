package com.github.gudian1618.Java_2;

import java.util.Arrays;
import java.util.Comparator;

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
//        IEat ieat6 = (thing, age) ->thing==null?1:0;
        
        ieat5.eat("apple", 12);
    
        Student[] students = {
                new Student("张三", 18),
                new Student("张四", 14),
                new Student("张二", 24)};
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        
//        Comparator<Student> c = (o1, o2)->o1.getAge()-o2.getAge();
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
        System.out.println(Arrays.toString(students));
        IEat.method();
        
    }
    
    private static int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
    // 默认方法与静态方法并不影响接口的契约，可以任意使用
    
}

//// 只有一个抽象方法的接口
//interface IEat {
//    public void eat();
//}

interface IEat {
    public int eat(final String thing, final int age);
    public default void print() {
        System.out.println("print test");
    }
    public static void method() {
        System.out.println("static method...");
    }
}

//class IEatImpl implements IEat {
//    @Override
//    public void eat(String thing, int age) {
//        System.out.println("eat apple"+thing+"..."+age);
//    }
//}