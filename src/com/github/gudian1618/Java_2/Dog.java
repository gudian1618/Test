package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-04 10:48
 * @description
 */

public class Dog {
    private String name;
    private int age;

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
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
        return "Dog [name="+name+",age="+age+"]";
    }


}
