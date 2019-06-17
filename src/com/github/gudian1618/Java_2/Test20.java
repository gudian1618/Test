package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/17 23:17
 * @description
 */
public class Test20 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1("喵喵小白",2);
        try {
            Cat1 newCat = (Cat1) cat1.clone();
            System.out.println("cat1 ="+cat1);
            System.out.println("new cat ="+newCat);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
