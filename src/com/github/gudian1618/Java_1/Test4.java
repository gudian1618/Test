package com.github.gudian1618.Java_1;

public class Test4 {
    
    public static void main(String[] args) {
//        Singleton1 s = Singleton1.getInstance();
//        s.print();
//        Singleton1 s1 = Singleton1.getInstance();
//        s1.print();
        
        Singleton2 s = Singleton2.getInstance();
        s.print();
        Singleton2 s2 = Singleton2.getInstance();
        //      s1.print();
        s2.print();
        
        System.out.println(s==s);
    }

}
// 饿汉式
class Singleton1{
    private Singleton1() {}
    private static Singleton1 s = new Singleton1();
    public static Singleton1 getInstance() {
        return s;
    }
    public void print() {
        System.out.println("测试方法");
    }
    
}
// 懒汉式，多线程时有安全问题，待修改
class Singleton2 {
    private Singleton2() {}
    private static Singleton2 s;
    
    public static Singleton2 getInstance() {
        if (s==null) {
            s = new Singleton2();
        }
        return s;
    }
    
    public void print() {
        System.out.println("测试方法");
    }
}