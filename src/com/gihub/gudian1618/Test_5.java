/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @create 2019-04-13 18:16
 * @description
 *
 * 内部类就是在一个类的内部定义一个类，内部类编译会生成一个类class
 * 1、成员内部类：直接在类中定义的类
 * 2、方法内部类：在类中的方法内定义一个内部类。
 *             方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化
 *             方法内部类对象不能使用该内部类所在方法的非final局部变量
 * 3、静态内部类
 * 4、匿名内部类
 *      （1）不能有构造方法，只能有一个实例。一次性
 *      （2）不能定义任何静态成员、静态方法。
 *      （3）不能用修饰符
 *      （4）一定是在new后面，勇气隐含实现一个接口或是继承一个类
 *      （5）匿名内部类是局部的，所以局部内部类的所有限制都对其生效
 * 内部类可以变相的实现多继承
 *
 * 依赖外部类的对象的：成员内部类、方法内部类、匿名内部类
 * 静态内部类不依赖外部类的对象，所以，在项目中，优先考虑选择静态内部类（不会产生内存泄漏）
 *
 *
 */

public class Test_5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
//        // 在外部创建成员内部类的对象实例,成员内部类需要依赖外部类的对象，
//        // 通常情况下不建议这样实例化内部类的对象
//        Outer.Inner inner = outer.new Inner();
//        inner.print();
        outer.innerPrint();
        outer.show();

        Outer.Inner3 inner3 = new Outer.Inner3();
        inner3.print();

        outer.print1();
        outer.print2();

        outer.print3(new Eat() {
            @Override
            public void eat() {
                System.out.println("参数式匿名内部类");
            }
        });
    }
}

class Outer {
    private String name;
    // -----------成员内部类--------
    // 建议在外部类中定义一个方法，对外提供访问内部类的接口
    public void innerPrint() {
        Inner inner = new Inner();
        inner.print();
    }
    // 成员内部类
    class Inner {
        private void print() {
            System.out.println("成员内部类"+name);
        }
    }

    //------方法内部类------
    // 受方法的局部变量或方法的参数，实际上是常量
    public void show() {
        final int x = 10;
        class Inner2 {
            public void print() {

                System.out.println("方法内部类"+x+name);
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.print();

    }

    //-------静态内部类----------
    // 静态内部类只能调用外部静态类，无法引用外部的非静态变量
    static class Inner3 {
        public void print() {
            System.out.println("静态内部类");
        }
    }

    //-------匿名内部类-----------
    // 继承式
    public void print1() {
        Cat cat = new Cat() {
            @Override
            public void eat() {
                System.out.println("cat:继承式匿名内部类");;
            }
        };
        cat.eat();
    }

    // 接口式
    public void print2() {
        Eat eat = new Eat() {
            @Override
            public void eat() {
                System.out.println("接口式匿名内部类");
            }
        };
        eat.eat();
    }

    // 参数式
    public void print3(Eat eat) {
        eat.eat();
    }

}

interface Eat {
    public void eat();
}

abstract class Cat {
    public abstract void eat();
}




