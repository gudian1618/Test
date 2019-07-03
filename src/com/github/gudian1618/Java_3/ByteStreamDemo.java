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
 * 输入输出字节流操作原理：每次只会操作一个字节，从文件中读取或写入。
 */
public class ByteStreamDemo {

    private static void in() {
        File file =
            new File("/Users/zyd/IdeaProjects/Test/src/com/github/gudian1618" +
                "/Java_3/lianxi.txt");
        try {
            InputStream in = new FileInputStream(file);

            byte[] bytes = new byte[120];
            // 表示每次读取的字节长度
            StringBuilder buf = new StringBuilder();
            int len = -1;
            // 把数据读入到数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，等于-1表示文件已读完
            while ((len = in.read(bytes))!=-1) {
                // 根据读取的字节数组，再转化为字符串内容，添加到StringBuilder
                buf.append(new String(bytes,0,len));
            }
            System.out.println(buf);
            // 关闭输入流
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
    }

    }
    
    private static void out() {
        // 0、确实目标文件
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github/gudian1618/Java_3/lianxi.txt");
        // 1、构建一个文件输出流对象
        try {
            // append表示在原有的基础上追加内容
            OutputStream out = new FileOutputStream(file,true);
            // 2、输出的内容是
            String info = "小河流水哗啦啦\n";
            // \n表示换行

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
        in();
    }
}
