package com.github.gudian1618.Java_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 15:42
 */
public class EchoServerDemo {

    public static void main(String[] args) {
        // 创建一个服务器的Socket（1024-65536）
        try {
            ServerSocket server = new ServerSocket(6666);
            System.out.println("服务器启动，正在地等待客户端的连接。。。");
            // 等待客户端的链接，造成阻塞，如果有客户端连接成功，立即返回一个Socket对象
            Socket socket = server.accept();
            System.out.println("客户端连接成功"+server.getInetAddress().getHostAddress());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 通过输入流读取网络数据,如果没有数据，那么会阻塞
            String info = br.readLine();
            System.out.println(info);
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
            ps.println("echo："+info);
            ps.flush();
            // 关闭
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
