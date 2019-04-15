package com.github.gudian1618.Java_1;

/**
 *
 *
 */

public class Test3 {
    public static void main(String[] args) {
        
        Student s = new Student();
        Student s1 = new Student();
    
    }
}

class Student1 {
    
    static {
        System.out.println("静态代码块");
    }
    
    {
        System.out.println("我是构造代码块");
    }
    
    public Student1() {
        System.out.println("构造方法，普通代码块");
    }
    
    public void study() {
    
    }
    
}