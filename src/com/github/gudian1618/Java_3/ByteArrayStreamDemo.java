package com.github.gudian1618.Java_3;

import java.io.ByteArrayInputStream;

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
        int curr = -1;
        while ((curr=bais.read())!=-1) {
            if ((curr>=65 && curr <=) || (curr>=97 && curr<=122)) {

            }
        }
    }

    public static void main(String[] args) {

    }

}
