package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-11 23:48
 * @description
 * 打印流：很方便的进行输出
 * 字节打印流
 * 在字节输出时，可以增强输出功能
 * 字符打印流
 *
 */

public class PrintStreamDemo {

    private static void CharPrint() {
        try {
            File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
                "/gudian1618/Java_3/lianxi4");
            Writer out = new FileWriter(file);
            // 加缓存
            BufferedWriter bos = new BufferedWriter(out);
            // 增强打印功能
            PrintWriter pw = new PrintWriter(bos);
            pw.println("小河流水天天哗啦啦");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void bytePrint() {
        try {
            File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
                "/gudian1618/Java_3/lianxi4");
            OutputStream out = new FileOutputStream(file);
            // 加缓存
            BufferedOutputStream bos = new BufferedOutputStream(out);
            // 增强打印功能
            PrintStream ps = new PrintStream(bos);
            ps.printf("小河流水天天哗啦啦");
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }
}
