package com.github.gudian1618.Java_6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 15:48
 */
public class MultiClientDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // 创建一个Socket对象，指定链接的服务器
        try {
            Socket socket = new Socket("localhost",6668);
            // 获取socket的输入输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println("请输入：");
            String info = input.nextLine();

            ps.println(info);
            ps.flush();
            // 读取服务器端的返回数据
            info = br.readLine();
            System.out.println(info);
            ps.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
