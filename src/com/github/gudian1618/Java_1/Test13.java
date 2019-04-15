package com.github.gudian1618.Java_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/4/15 9:44
 * @description
 *
 * 异常：阻止当前方法或作用域继续执行的问题，在程序中导致程序中断运行的一些指令。
 *      实际上抛出一个异常类的实例化对象。
 *      1、try不能单独存在，catch可以有多个，finally最后最多一个。三者组合使用，
 *      作用域分别独立，不能互相访问。
 *      2、当有多个catch块时，jvm会匹配其中一个执行，而不执行其他快。
 *
 *      ArithmeticException
 *      ArrayIndexOutOfBoundsException
 *      NullPointerException
 *      InputMismatchException
 *      RuntimeException
 *      ClassNotFoundException
 *      DataFormException
 *      ClassCastException 类型转换
 *
 *
 * 自定义异常：详见名称类
 * 受检异常
 * 非受检异常
 *
 */
public class Test13 {
    
    public static void main(String[] args) {
//        div1(10, 2);
//        method();
//        div2(20, 0);
        input();
    }
    
    private static void div1(int num1, int num2) {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[4]);
            arr = null;
            System.out.println(arr.length);
            int result = num1/num2;
            System.out.println("result:"+result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("出错了");
            e.printStackTrace();
        } finally {
            System.out.println("执行完毕");
        }

        System.out.println();
    }
    
    private static int method() {
        int a = 10;
        int b = 5;
        try {
            System.out.println("a="+a);
            System.out.println("b="+b);
            int c = a/b;
            System.out.println("a/b="+c);
            return c;
        } catch (Exception e) {
            //　代码测试时，上线注释掉
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return -1;
    }
    // 自用补全alt+/
    private static int div2(int a, int b) throws ArithmeticException {
        int c = 0;
        try {
            c = a/b;
            return c;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("除数不能为0");
        } finally {
            System.out.println("运行结束");
        }
    }
    
    private static void input() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        try {
            num = input.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("输出不匹配");
        }
        
    }
    
}


