package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-07-22 15:38
 * @description
 * 对象序列化
 * 把对象写入文件：实际写入的时类名、属性名、属性类型、属性的值等。
 * 反序列化
 * 从文件中，把文件的内容读取出来还原成对象
 *
 */

public class ObjectStreamDemo {

    private static void readObject() {
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/dog.obj");
        try {
            InputStream in = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(in);
            Dog dog = (Dog)ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

//    java.io.NotSerializableException 没有序列化异常
    private static void writerObject() {
        Dog dog = new Dog("wangwang",2,"母");
        File file = new File("/Users/zyd/IdeaProjects/Test/src/com/github" +
            "/gudian1618/Java_3/dog.obj");
        try {
            OutputStream out = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(dog);
            oos.close();
            System.out.println(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writerObject();
        readObject();
    }
}
