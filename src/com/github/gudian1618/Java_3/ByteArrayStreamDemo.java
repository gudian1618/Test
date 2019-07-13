package com.github.gudian1618.Java_3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-14 00:52
 * @description
 */

public class ByteArrayStreamDemo {

    private static void byteArray() {

        String s = "1234567890gfdgfds(*$#@&^%^&SSFD";
        ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int curr = -1;
        while ((curr=bais.read())!=-1) {
            if ((curr>=65 && curr <=90) || (curr>=97 && curr<=122)) {
                baos.write(curr);
            }
        }
    }

    public static void main(String[] args) {

    }

}
