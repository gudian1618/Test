package com.github.gudian1618.Java_4;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 16:32
 * 泛型类
 * T:参数化类型，在实际使用时才会指定具体的类型
 * 泛型只作用于编译期，在编译后会被擦除
 */
public class Node<T> {
    
    private T data;
    
    public Node() {
    }
    
    public Node(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
