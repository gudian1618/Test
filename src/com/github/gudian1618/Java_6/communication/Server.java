package com.github.gudian1618.Java_6.communication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/18 19:53
 */
public class Server {

    public static void main(String[] args) {
        // 保存客户端处理的线程
        Vector<UserThread> vector = new Vector<>();
        ExecutorService es = Executors.newFixedThreadPool(5);
        // 创建服务器端的Socket

        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已启动，正在等待连接。。。");
            while (true) {
                Socket socket = server.accept();
                UserThread user = new UserThread(socket, vector);
                es.execute(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class UserThread implements Runnable {
    private String name; // 客户端的用户名称（唯一）
    private Socket socket;
    Vector<UserThread> vector;
    public UserThread(Socket socket, Vector<UserThread> vector) {
        this.socket = socket;
        this.vector = vector;
        vector.add(this);
    }
    @Override
    public void run() {

    }
}
