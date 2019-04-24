package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019/4/24 19:34
 * @description
 *
 *
 *
 */

public class Test_8 {

    private static void f1() {
        for (int i=0; i<4; i++) {
            for (int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void f2(int m, int n, String c) {
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static int f3() {
        return 4*6;
    }

    private static int f4(int x, int y) {
        return x*y;
    }

    protected static int f5(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        if (c>max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        f1();
        f2(5, 6, "@#");
        System.out.println(f3());
        System.out.println(f4(6, 5));
        System.out.println(f5(2,4,5));

    }
}


