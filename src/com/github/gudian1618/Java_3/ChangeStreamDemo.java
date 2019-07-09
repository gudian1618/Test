package com.github.gudian1618.Java_3;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-06 22:41
 * @description
 * 字节流转换成字符流。
 * 转换流：输入输出都是相对程序而言，流入程序叫输入，流出程序叫输出。
 * OutputStreamWriter：可以将输出的字符流转换为字节流的输出形式，
 * InputStreamReader：将输入的字节流转换为字符流输入形式
 * 代码的表现形式是字节流转换成字符流，也就是字节流封装成字符流。
 *
 */

public class ChangeStreamDemo {

    private static void write(OutputStream out) {
        Writer writer = new OutputStreamWriter(out, Charset.defaultCharset());
        try {
            writer.write("开开心心来玩耍\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(InputStream in) {
        Reader reader = new InputStreamReader(in, Charset.forName("UTF-8"));
        char[] cs = new char[128];
        int len = -1;
        try {
            while ((len = reader.read(cs)) != -1) {
                System.out.println(new String(cs, 0, len));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        InputStream in = new FileInputStream("/Users/zyd/IdeaProjects/Test" +
            "/src/com/github/gudian1618/Java_3/lianxi.txt");
        read(in);
        OutputStream out = new FileOutputStream("/Users/zyd/IdeaProjects/Test" +
            "/src/com/github/gudian1618/Java_3/lianxi2.txt");
        write(out);

    }
}
