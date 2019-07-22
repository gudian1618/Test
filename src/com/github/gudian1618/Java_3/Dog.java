package com.github.gudian1618.Java_3;

import java.io.Serializable;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-22 15:45
 * @description
 * 如果一个类需要被序列化，该类必须实现Serializable接口
 * 就是一个标志接口，没有任何定义，为了告诉JVM该类对象可以被序列化，交给JVM处理
 * 神魔时候对象需要被序列化？
 * 1、把对象保存到文件中（存储到物理介质中）
 * 2、对象需要在网络上传输时
 */

public class Dog implements Serializable {

    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Dog() {
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            '}';
    }
}
