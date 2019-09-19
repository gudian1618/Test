package com.github.gudian1618.Java_6.communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            ServerSocket server = new ServerSocket(8889);
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

/*
 * 客户端处理得线程
 * */

class UserThread implements Runnable {
    Vector<UserThread> vector; // 客户端处理线程的集合
    private String name; // 客户端的用户名称（唯一）
    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private boolean flag = true;

    public UserThread(Socket socket, Vector<UserThread> vector) {
        this.socket = socket;
        this.vector = vector;
        vector.add(this);
    }

    @Override
    public void run() {
        try {
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            while (flag) {
                // 读取消息对象
                Message msg = (Message) ois.readObject();
                int type = msg.getType();
                switch (type) {
                    case MessageType.TYPE_LOGIN:
                        name = msg.getFrom();
                        msg.setInfo("欢迎你：");
                        oos.writeObject(msg);
                        break;
                    case MessageType.TYPE_SEND:
                        String to = msg.getTo();
                        UserThread ut;
                        int size = vector.size();
                        for (int i = 0; i < size; i++) {
                            ut = vector.get(i);
                            if (to.equals(ut.name) && ut != this) {
                                ut.oos.writeObject(msg);
                            }
                        }
                        break;
                }
            }
            ois.close();
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
