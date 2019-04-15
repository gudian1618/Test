package com.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/4/12 15:38
 */

/**
 * Object类 是类层次结构的根类
 * 每个类都是用Object作为父类
 *
 *
 *
 */

public class Test12 {
    public static void main(String[] args) {
    Student s = new Student(1, "菲菲", 18);
        System.out.println(s.toString());
    Student s2 = new Student(2, "beibei", 20);
    boolean b =s.equals(s2);
        System.out.println(b);
    String s1 = new String("lele");
    String s3 = new String("lele");
        System.out.println(s1.equals(s3));
    }
}

class Student {
    private String name;
    private int sid;
    private int age;
    public Student() {}
    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }
    // 重写Object类中的toString方法
    @Override
    public String toString() {
        return "sid="+sid+",name="+name+",age"+age;
    }
    
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
