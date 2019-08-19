package com.github.gudian1618.Java_4;

import java.util.ArrayList;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 16:16
 * 泛型：即参数化类型，将类型由原来的具体的类型参数化，
 * 类似于方法中的变量参数，此时类型也定义成参数形式（类型参数），
 * 然后在使用、调用时传入具体的类型（类型实参）
 *
 */
public class GenericDemo {
    
    public void testNode() {
        Node<Number> numberNode = new Node<>();
        Node<Integer> integerNode = new Node<>();
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
}
