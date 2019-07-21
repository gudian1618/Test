package com.github.gudian1618.Java_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-21 22:31
 * @description
 *
 *
 */

public class RandomAccessFileDemo {

    public static void main(String[] args) {

        try {
            RandomAccessFile r = new RandomAccessFile(" /Users/zyd/IdeaProjects/Test/src/com/github/gudian1618/Java_3/lianxi6.txt","r");

            RandomAccessFile w = new RandomAccessFile(" /Users/zyd/IdeaProjects/Test/src/com/github/gudian1618/Java_3/lianxi6.txt","rw");

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len=r.read(bytes))!=-1) {
                w.write(bytes,0,len);
            }
            w.close();
            r.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("copy success!");
    }
}
