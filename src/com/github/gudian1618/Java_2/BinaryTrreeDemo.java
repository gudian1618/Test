package com.github.gudian1618.Java_2;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 16:15
 * @description
 * 树是一种非线性数据结构。
 * 二叉树
 * 第一个元素为根节点
 * 元素大于根节点的房右子树，小于的放左子树。
 */
public class BinaryTrreeDemo {
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        // 8,3,10,1,6,14,4,7
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        
        bt.print();
    
    }
}



