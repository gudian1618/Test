package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/5/15 18:00
 * @description
 */
public class Cat1 {
    private String name;
    private int age;
    
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
    
    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Cat1() {
        super();
    }
}
