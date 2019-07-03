package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-03 23:29
 * @description
 */

public class CopyFileDemo {

    public static void main(String[] args) {

    }

    private static void copy(String src, String target) {
        File srcfile = new File(src);
        File targetfile = new File(target);
        try {
            InputStream in = new FileInputStream(srcfile);
            OutputStream out = new FileOutputStream(targetfile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
