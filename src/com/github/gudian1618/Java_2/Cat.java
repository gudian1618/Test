package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-04 09:21
 * @description
 *
 * 自定义对象，要实现比较排序
 * 1、可以实现Comparable接口的comparaTo方法，此接口是对实现它的每个类的对象进行整体排序，称为自然排序，小于返回负整数、等于返回0，大于返回正整数
 * 2、Comarator接口要求自定义类去实现，按照oo原则对修改关闭，对扩展开放。强行对某个对象collection进行整体排序。
 *
 */

public class Cat implements Comparable<Cat>{

    private String name;
    private int age;

    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name="+name+",age="+age+"]";
    }

    @Override
    public int compareTo(Cat o) {
        return this.age-o.age;
    }
}
