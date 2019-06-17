package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/5/15 18:00
 * @description
 * 对象具备克隆功能
 * 1、实现Cloneable接口
 * 2、重写Object类中的Clone方法
 */
public class Cat1 implements Cloneable{
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
        super();
        this.name = name;
        this.age = age;
    }
    
    public Cat1() {
        super();
    }
    
    // 重写Object中的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Cat1 [name= " + name + ", age=" + age + "]";
    }
}
