package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-03 23:29
 * @description
 * 文件的复制：
 * 从一个输入流中读取数据，然后通过输出流写入目标位置。
 */

public class CopyFileDemo {

    public static void main(String[] args) {
        System.out.println("start copy...");
        copy("/Users/zyd/IdeaProjects/Test/src/com/github/gudian1618/Java_3" +
            "/lianxi.txt","/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/dabin/copy.txt");
        System.out.println("copy success!");
    }

    private static void copy(String src, String target) {
        File srcfile = new File(src);
        File targetfile = new File(target);
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(srcfile);
            out = new FileOutputStream(targetfile);

            byte[] bytes = new byte[256];
            int len = -1;
            while ((len=in.read(bytes))!=-1) {
                out.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in!=null) in.close();
                if (out!=null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
