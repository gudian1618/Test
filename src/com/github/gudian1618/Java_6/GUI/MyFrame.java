package com.github.gudian1618.Java_6.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/19 11:18
 *
 */
public class MyFrame extends Frame implements ActionListener {

    public MyFrame() {
        /*
        * 初始化窗体的基本属性
        * */
        this.setSize(600, 400);
        this.setTitle("我的第一个GUI窗体");
        // 创建按钮
        Button button = new Button("点我一下有惊喜");
        // 给按钮添加单击事件
        button.addActionListener(this);
        // 创建一个线性布局
        FlowLayout flowLayout = new FlowLayout();
        // 把布局应用到窗体上
        this.setLayout(flowLayout);

        // 给窗体添加关闭事件
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        // 把按钮添加到窗体上
        this.add(button);
        this.setVisible(true);
    }

    // 单击事件处理的方法
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("惊喜来了，获得100元大红包");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
