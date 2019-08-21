package com.github.gudian1618.Java_4;

import java.util.ArrayList;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 16:16
 * 泛型：即参数化类型，将类型由原来的具体的类型参数化，
 * 常用T、E、K、V等形式的参数常用于表示泛型形象，
 * 类似于方法中的变量参数，此时类型也定义成参数形式（类型参数），
 * 然后在使用、调用时传入具体的类型（类型实参）
 * 泛型只作用于编译期，在编译后，会被擦除。
 * 通配符
 * "?"表示的是可以接收任意的泛型，但是只能接收输出，不能修改。
 */
public class GenericDemo {
    
    public void test3() {
        Node<Number> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
//        getData(n1);
//        getData(n2);
//        n1=n2 不支持，泛型类型不匹配
        getData2(n2);
    }
    
    public static void getData2(Node<?> node) {
        System.out.println(node.getData());
    }
    
    public static void getData(Node<Number> node) {
        System.out.println(node.getData());
    }
    
    public void test2() {
        Node<String > stringNode = new Node<>("gudian1618");
        Node<Integer> integerNode = new Node<>(10);
    
        System.out.println(stringNode.getData());
        System.out.println(integerNode.getData());
    }
    
    public void test1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("gudian1618");
//        list.add(10);
//        list.add(new Object());
    
        for (int i = 0; i < list.size(); i++) {
//            如果我们不能确定集合中的元素空类型，那么我们需要在处理元素时
//            要判断元素的类型，才能做相应的操作
        
        }
    }
        public static void main(String[] args) {
    
    }
    
}
