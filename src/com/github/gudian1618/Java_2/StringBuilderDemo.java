package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-10 22:37
 * @description
 */

public class StringBuilderDemo {
    public static void main(String[] args) {

        // 面试题：StringBuffer与StringBuilder的区别？
        // StringBuffer是线程安全的，性能低
        // StringBuilder是线程不安全的，性能高，适合在单线程中使用，这种情况占大多数，在JDK1.5以后添加
        StringBuilder sb = new StringBuilder();

        // 字符串相加操作
        // 1、多个常量相加没有性能问题，在编译期优化
        // 2、变量与常量相加，会产生多个垃圾对象

//        String a = "a"+1;
//        System.out.println(a);
//        String b = a+"b";
//        System.out.println(b);

        String c = null;
        for (int i=0;i<5;i++) {
            c += i;//每次循环会产生一个StringBuilder对象实现拼接，性能低，最好是手动创建StringBuilder来拼接
        }
        //1、字符串相加，在编译后，会使用StringBuilder来优化代码，实现拼接

    }
}
