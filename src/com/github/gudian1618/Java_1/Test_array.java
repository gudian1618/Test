package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019/4/24 21:57
 * @description
 *
 */

public class Test_array {
    public static void main(String[] args) {
        // 声明并初始化数组
        // 数组是引用数据类型
        int[] arr4 = new int[3];
        arr4[0] = 11;
        arr4[1] = 14;
        arr4[2] = 145;

        int a = arr4[0]; // 取出arr数组的第一个元素，并赋值a
        System.out.println(a);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        // 声明使用其他类型的数组
        byte[] arr1 = new byte[4];
        short[] arr2 = new short[5];
        long[] arr3 = new long[3];

        int[] arr9 = {1,2,3,4,5,6,7};
        System.out.println(arr9[2]);
        System.out.println(arr9.length); // 获取数组长度

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a);

    }
}
