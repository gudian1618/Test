package com.github.gudian1618.Java_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/6 16:10\
 * Collection接口：用于存储单个对象的集合
 * List接口：
 * 1、有序的
 * 2、允许多个null元素
 * 3、具体的实现类常用的：ArrayLiat，vector、LinkedList
 * Set接口：
 *
 */
public class ListDemo {

    private static void arrayList() {
        // 使用集合来存储多个不同类型的元素对象，那么在处理时比较麻烦，在实际开发中不建议这样使用。
        // 在一个集合中存储相同类型的对象
        List<String> list = new ArrayList<>();
        list.add("李老师");
        list.add("张老师");
        list.add("赵老师");
        list.add("苍老师");
        // 遍历集合
        int size = list.size();
        // 这样效率高，计算性能高，只计算一次，新建对象,还有更高效的方法。
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains("苍老师"));
        list.remove("赵老师");
        System.out.println(list.size());

//        String[] array = list.toArray(new String[]{});
//        for (String s: array) {
//            System.out.println(s);
//        }
    }

    private static void vector() {
        // 实现
        Vector<String > v = new Vector<>();
        v.add("苍老师");
        v.add("张老师");
        v.add("王老师");
        v.add("李老师");

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }

    private static void linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("苍老师");
        list.add("张老师");
        list.add("王老师");
        list.add("李老师");
        String[] array = list.toArray(new String[]{});
        for (String s: array) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        arrayList();
        System.out.println("========");
        vector();
        System.out.println("========");
        linkedList();
    }
}
