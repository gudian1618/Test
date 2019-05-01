package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-01 22:11
 * @description
 * String 表示一个字符串，内部使用字符数组实现，不能被继承的最终类
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

        String a = "a";
        String a1 = a+1;
        String a2 = "a1";
        System.out.println(a1==a2);



    }
}
