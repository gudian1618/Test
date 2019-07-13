package com.github.gudian1618.Java_3;

import java.io.*;

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

    private static void read() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi5.txt");
        try {
            InputStream in = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(in);
            DataInputStream dis = new DataInputStream(bis);
            // 写入4个字节
            int num = dis.readInt();
            // 写入一个字节
            byte b = dis.readByte();
            String s = dis.readUTF();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/lianxi5.txt");
        try {
            OutputStream out = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            DataOutputStream dos = new DataOutputStream(bos);
            // 写入4个字节
            dos.writeInt(10);
            // 写入一个字节
            dos.writeByte(1);
            dos.writeUTF("中");
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        write();
        read();
    }
}
