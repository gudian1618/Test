package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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
 *
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

    public static void main(String[] args) {

    }
}
