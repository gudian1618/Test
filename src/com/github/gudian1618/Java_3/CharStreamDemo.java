package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-03 22:23
 * @description
 * 字符流：
 * 字符输入流：Writer，对文件的操作使用子类：FileWriter
 * 字符输出流：Reader，对文件的操作使用子类：FileReader
 * 每次操作的单位是一个字符
 * 文件字符操作流会自带缓存，默认大小为1024字节，在缓存满后，或手动刷新缓存，或者关闭流时会把数据写入文件中。
 * 字节操作流，默认每次执行写入操作会直接把数据写入文件。
 * 如何选择使用字节流还是字符流：
 * 一般操作非文本文件时，使用字节流；操作文本文件时，建议使用字符流。
 * 字符流的内部实现还是字节流，只是封装使用后，更为简单方便，适用于专用的场景。
 * 总结，如果确定要处理的流是可打印的字符，那么使用字符流会看上去简单一点。否则，如果不确定，字节流总是不会错的。
 */

public class CharStreamDemo {

    private static void out() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi1.txt");
        try {
            Writer out = new FileWriter(file);
            out.write("村花到我家");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void in() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi1.txt");
        try {
            Reader in = new FileReader(file);
            char[] cs = new char[1];
            int len = -1;
            StringBuilder buf = new StringBuilder();
            while ((len=in.read(cs))!=-1) {
                buf.append(new String(cs,0,len));
            }
            in.close();
            System.out.println(buf);
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
