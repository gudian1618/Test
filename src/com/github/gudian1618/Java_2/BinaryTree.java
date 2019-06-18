package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 16:22
 * @description
 */
public class BinaryTree {
    
    private Node root;
    
    public void add(int data) {
        if (root==null) {
            root = new Node(data);
        } else {
        root.addNode(data);
        }
    }
    
    public void print() {
    
    }
    
    private class Node {
        
        private int data;
        private Node left;
        private Node right;
        public Node(int data) {
            this.data = data;
        }
        
        public void addNode(int data) {
            if (this.data>data) {
                if (this.left==null) {
                    this.left = new Node(data);
                } else {
                this.left.addNode(data);
                }
            } else {
                if (this.right==null) {
                    this.right = new Node(data);
                } else {
                    this.right.addNode(data);
                }
            }
        }
        
        // 中序遍历的方法
        public void printNode() {
        
        
        }
    }
}

