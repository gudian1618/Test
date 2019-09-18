package com.github.gudian1618.Java_6;

import java.io.IOException;
import java.net.Socket;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 15:48
 */
public class EchoClientDemo {

    public static void main(String[] args) {
        // 创建一个Socket对象，指定链接的服务器
        try {
            Socket socket = new Socket("localhost",6666);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
