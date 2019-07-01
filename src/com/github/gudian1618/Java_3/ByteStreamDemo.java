package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/26 23:01
 * @description
 * 字节输出流
 * 输出流：超类OutputStream，对文件的输出流使用子类FileOutputStream
 * 输入流：超类InputStream，对文件的输入使用子类FileInputStream
 */
public class ByteStreamDemo {

    private static void in() {
        File file =
            new File("/Users/zyd/IdeaProjects/Test/src/com/github/gudian1618" +
                "/Java_3/lianxi1.txt");
        try {
            InputStream in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    private static void out() {
        // 0、确实目标文件
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github/gudian1618/Java_3/lianxi.txt");
        // 1、构建一个文件输出流对象
        try {
            OutputStream out = new FileOutputStream(file);
            // 2、输出的内容是
            String info = "小河流水哗啦啦";
            // 3、把内容写入到文件
            out.write(info.getBytes());
            // 4、关闭流
            out.close();
            System.out.println("write success!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        out();
    }
}
