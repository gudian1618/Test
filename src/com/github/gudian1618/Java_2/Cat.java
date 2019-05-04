package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-04 09:21
 * @description
 */

public class Cat {

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
}
