package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-09 23:21
 * @description
 * 缓存的目的：以后写文件要用缓存的方式
 * 解决在写入文件操作时，频繁的操作文件所带来的性能降低的问题。
 * BufferOutputStream 内部默认的缓存大小是8KB，每次写入时存储到缓存中的byte
 * 数组中，当数组存满时，会把数组中的数据写入到文件中，并且缓存下标归零。
 * 可以通过实现抽象类cloneable，在try语句中直接写条件，自动关闭。
 */

public class BufferStreamDemo {

    private static void charReader() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi7.txt");
        Reader reader = new FileReader(file);
    }

    private static void byteReader() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi3.txt");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {

            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len=bis.read(bytes))!=-1) {
                System.out.println(new String(bytes,0,len));
            }

            // out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void byteWriter() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi3.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            // 构造一个字节缓冲流
            BufferedOutputStream bos = new BufferedOutputStream(out);
            String info = "小河还是流水哗啦啦";
            out.write(info.getBytes());
            bos.close();
            // out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        byteWriter();
        byteReader();
    }
}
