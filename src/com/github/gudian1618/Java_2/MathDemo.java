package com.github.gudian1618.Java_2;

import java.util.Random;

import static java.lang.Math.*;
// 静态导入
/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-03 22:09
 * @description
 */

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(abs(-10));
        System.out.println(round(random()*100));
        System.out.println(sqrt(3));
        System.out.println(floor(1.234));

        Random r = new Random();
        System.out.println(r.nextLong());
        System.out.println(r.nextInt());

    }

}
