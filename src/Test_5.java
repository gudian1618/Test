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
 *
 *
 *
 */

public class Test5 {
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

}


