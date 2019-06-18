package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 14:35
 * @description
 */
public class Student {
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
    
    @Override
    public String toString() {
        return "Student [name="+name+", age"+age+"]";
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Student() {
    }
}
