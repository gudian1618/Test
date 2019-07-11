package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-11 23:48
 * @description
 * 打印流：很方便的进行输出
 *
 */

public class PrintStreamDemo {

    private static void bytePrint() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi4");
        OutputStream out = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(out);
        PrintStream ps = new PrintStream(bos);
        ps.printf("小河流水天天哗啦啦");
        ps.close();

    }

    public static void main(String[] args) {

    }
}
