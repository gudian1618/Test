package com.github.gudian1618.Java_3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-14 00:52
 * @description
 * 字节数组流：
 * 基于内存操作，内部维护着一个字节数组，我们可以利用流的读取机制来处理字符串，无需关闭。
 */

public class ByteArrayStreamDemo {

    private static void byteArray() {

        String s = "1234567890gfdgfds(*$#@&^%^&SSFD";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;
        while ((curr=bais.read())!=-1) {
            if ((curr>=65 && curr<=90) || (curr>=97 && curr<=122)) {
                baos.write(curr);
            }
        }
        // 此时无需关闭，原因，字节数组流是基于内存的操作
        System.out.println(baos.toString());
    }

    public static void main(String[] args) {
        byteArray();
    }

}
