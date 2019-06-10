package com.github.gudian1618.Java_2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;
// 静态导入
/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-03 22:09
 * @description
 * Math/Random/Date 类
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
        System.out.println(r.nextInt(10));
        
        // 大整数运算
        String val1 = "54312312313131";
        String val2 = "33254676586875";
        BigInteger b1 = new BigInteger(val1);
        BigInteger b2 = new BigInteger(val2);
    
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.remainder(b2));
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
        
        String val3 = "5343.2542345234523";
        String val4 = "656.34243242342332";
    
        BigDecimal h3 = new BigDecimal(val3);
        BigDecimal h4 = new BigDecimal(val4);
        System.out.println(h3.add(h4));
        System.out.println(h3.subtract(h4));
        System.out.println(h3.multiply(h4));
        System.out.println(h3.divide(h4)); // 除不尽，有数学异常抛出
        
        
    }

}
