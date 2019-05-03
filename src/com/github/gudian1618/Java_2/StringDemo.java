package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-01 22:11
 * @descript
 * String 表see示一个字符串，内部使用字符数组实现，不能被继承的最终类
 * 字符串常量池
 * String类编译器与运行期的分析，四种情况
 *
 */

public class StringDemo {

    public static void main(String[] args) {

        // String 的两种赋值方式，推荐使用第一种方式
        // 1.直接赋值，在常量内存空间
        String s1 = "奋斗";
        // 2.使用new关键字创建对象,生成两个对象在内存中
        String s2 = new String("粪粪");
        String s3 = "奋斗";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        // 1.直接赋值字符串连接时，考虑编译期和运行期
        // 如果在编译期可以被确定（常量可以被确定，变量不能被确定），那么就使用已有的对象，否则会创建新的对象
        // 变量不可以确定
        String a = "a";
        String a1 = a+1;
        String a2 = "a1";
        System.out.println(a1==a2);
        // 2.常量可以确定
        final String b = "b";
        String b1 = b+"1";
        String b2 = "b1";
        System.out.println(b1==b2);
        // 3.方法必须在运行期才能得到具体值，相当于通过方法创建了一个常量池，但不确定，必须是运行期方法才能确定具体值
        String c = getC();
        String c1 = c+"1";
        String c2 = "c1";
        System.out.println(c1==c2);
        // 4.即使final修饰这是最后的实现，不可再改，但是方法必须在运行期才能获得具体值，即不确定，会创建新的堆内存。
        final String d = getD();
        String d1 = d+1;
        String d2 = "d1";
        System.out.println(d1==d2);
    }

    private static String getC() {
        return "c";
    }

    private static String getD() {
        return "d";
    }

}
