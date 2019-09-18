package com.github.gudian1618.Java_6;

import java.io.*;
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
            // 获取socket的输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ps.println("hello,my name is Bin");
            ps.flush();
            // 读取服务器端的返回数据
            String info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
