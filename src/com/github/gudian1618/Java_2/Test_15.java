package com.github.gudian1618.Java_2;

import java.util.Arrays;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-04 09:17
 * @description
 */

public class Test_15 {
    public static void main(String[] args) {

        int[] nums = {32,45,66,23,5,1,98,54,12};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] names = {"jack","tom","菲菲","粪粪"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));;

        Cat[] cats = {new Cat("粪粪",4),new Cat("Tom",2)};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));



    }
}
