package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-09 23:21
 * @description
 */

public class BufferStreamDemo {

    private static void byteWriter() throws IOException {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi3.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            // 构造一个字节缓冲流
            BufferedOutputStream bos = new BufferedOutputStream(out);
            String info = "小河还是流水哗啦啦";
            out.write(info.getBytes());
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
