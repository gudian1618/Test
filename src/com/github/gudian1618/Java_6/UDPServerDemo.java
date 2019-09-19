package com.github.gudian1618.Java_6;

import java.io.IOException;
import java.net.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/19 10:46
 */
public class UDPServerDemo {

    public static void main(String[] args) {
        String info = "good good 学习，天天 up";
        byte[] bytes = info.getBytes();
        try {
            /*
            *
            * */
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8000);
            DatagramSocket socket = new DatagramSocket(9000);
            socket.send(dp);
            socket.close();
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
