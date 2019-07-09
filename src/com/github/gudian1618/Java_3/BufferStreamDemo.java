package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-09 23:21
 * @description
 */

public class BufferStreamDemo {

    private static void byteWriter() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi3.txt");
        try {
            OutputStream out = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
