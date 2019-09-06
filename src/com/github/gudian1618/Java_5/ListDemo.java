package com.github.gudian1618.Java_5;

import java.util.ArrayList;
import java.util.List;

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

    private void arrayList() {
        List list = new ArrayList();
        list.add("李老师");
        list.add("张老师");
        list.add("赵老师");
        list.add("苍老师");
    }

    public static void main(String[] args) {

    }
}
