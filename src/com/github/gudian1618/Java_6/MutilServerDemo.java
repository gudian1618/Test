package com.github.gudian1618.Java_6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 15:59
 * 处理多个客户端
 * 主线程用于监听客户端的连接，每次有链接成功，开启一个线程来处理该客户端的消息
 */

public class MutilServerDemo {

    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(3);
        try {
            ServerSocket server = new ServerSocket(6668);
            System.out.println("服务器已经启动，处于等待程序接收处理中。。。");
            while (true) {
                Socket s = server.accept();
                System.out.println(s.getInetAddress().getHostAddress());
                es.execute(new UserThread(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class UserThread implements Runnable {
    /*
    * 用来处理客户端请求的线程任务
    * */
    private Socket s;

    public UserThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream ps = new PrintStream(new BufferedOutputStream(s.getOutputStream()));
            String info = br.readLine();
            System.out.println(info);
            ps.println("echo:"+info);
            ps.flush();
            ps.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}