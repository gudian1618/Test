package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-14 01:24
 * @description
 * 数据流：
 * 与机器无关的操作JAVA的基本数据类型
 */

public class DataStreamDemo {

    private static void write() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi5.txt");
        OutputStream out = new FileOutputStream(file);
    }

    public static void main(String[] args) {

    }
}
