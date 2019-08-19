package com.github.gudian1618.Java_3;

import java.nio.ByteBuffer;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 10:12
 */
public class NIODemo {
    
    public static void main(String[] args) {
//        创建一个字节缓冲区，申请内存空间为8字节
        ByteBuffer buf = ByteBuffer.allocate(8);
    
        System.out.println("position="+buf.position());
        System.out.println("limit="+buf.limit());
        System.out.println("capacity="+buf.capacity());
        System.out.println("========================");
        
//        向缓冲区中写入数据
        buf.put((byte)10);
        buf.put((byte) 20);
        buf.put((byte) 30);
        buf.put((byte) 40);
        System.out.println("position="+buf.position());
        System.out.println("limit="+buf.limit());
        System.out.println("capacity="+buf.capacity());
        System.out.println("========================");
        
//        缓冲区反转
        buf.flip();
        System.out.println("position="+buf.position());
        System.out.println("limit="+buf.limit());
        System.out.println("capacity="+buf.capacity());
        System.out.println("========================");
//        告知当前位置和限制之间是否有元素
        if (buf.hasRemaining()) {
            for (int i = 0; i < buf.remaining(); i++) {
                byte b = buf.get();
                System.out.println(b);
            }
        
        }
    }
}
