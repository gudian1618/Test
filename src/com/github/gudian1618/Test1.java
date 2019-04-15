package com.gudian1618;

/*
1、在类中的位置不同
    成员变量：在类中定义
    局部变量：在方法中定义或者方法的参数
2、在内存中的位置不同
    成员变量：在堆内存（成员变量属于对象，对象进堆内存）
    局部变量：在栈内存（属于方法，方法进栈内存）
3、生命周期比不同
     成员变量：随对象的创建存在和销毁而伴随。
     局部变量：随方法的调用和调用完毕而伴随。
4、初始化值不同
    成员变量：有默认初始化值null
    局部变量：没有初始化值，必须赋值定义才能使用。
注意：
    局部变量名可以和成员变量名一样，在方法中使用的时候是就近原则。
    参数是局部变量

构造方法：
1、就是类构造对象时调用的方法，用于对象的初始化工作
2、是实例化一个类的对象时，也就是new的时候，最先调用的方法

构造方法是在类中定义的，方法名与类名称相同，无返回值类型的声明
1、构造方法就是类构造对象时调用的方法，用于对象的初始化工作
2、构造方法是实例化一个类的对象时，也就是new的时候，最先调用的方法

构造方法重载：
1、无参数
2、带一个参数
3、带多个参数

 */

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("wang",5);
        
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setAge(3);
        
        cat.eat();
    }
}

class Dog{
    // 默认构造方法，在无参数时可以不显式的写，带参数的，默认构造物参数方法必须显式的写，有其他构造方法时，要保留默认构造方法
    public Dog() {
        System.out.println("构造方法执行");
    }
    
    public Dog(String name) {
        this.name = name;
        System.out.println("带一个参数的构造方法执行");
    }
    
    public Dog(String name, int age) {
        this(name);//调用其他构造方法时，此语句需要在第一句，在构造方法互相调用时，必须有出口，否则死循环
//        this.name = name;
        this.age = age;
        System.out.println("带两个参数的构造方法执行");
    }
    
    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("我是狗的构造方法");
    }
    
    public void eat() {
        System.out.println("吃饭");

    }
    
    protected String name;
    private String sex;
    private int age;
    
    // 构造方法私有化，不能new，保证该类只有一个对象
}

/*
    this关键字
    1、调用类中的属性
    2、调用类中的方法或构造方法
    3、表示当前对象
    
 */
class Cat {
    private String name;
    private int age;
    
    public void setName(String name) { //name=mimi
        this.name = name; // this代表的是当前对象
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public void eat() {
        // 在方法中使用this调用类中的其他方法或属性，this可以省略，this前面可以使用类名.this
        System.out.println("我是"+this.getName()+"我爱吃鱼");
    }
}




