package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 16:59
 * @description
 * File类
 */
public class FileDemo {
    
    public static void main(String[] args) {
        // FIle类表示一个文件或目录
        File f1 = new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3/lianxi.txt");
        // 或者\\表示转义字符写也行，
        // F:/ProgramData/Test/src/com/github/gudian1618/Java_3/lianxi.txt"
        if (!f1.exists()) {
            // 判断文件是否存在
            try {
                // 创建文件
                f1.createNewFile();
                System.out.println("文件创建成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // f1.isFile():是否是文件
        System.out.println("是否为文件夹："+f1.isDirectory());
        // 需要手动建立新的文件夹my，且删除文件夹的时候必须保证文件夹是空的才可以删除，里面有文件无法删除。
        File f2 = new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3/my");
        File f3 = new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3");
        System.out.println("是否为文件夹："+f2.isDirectory());

        boolean b = f2.delete();
        System.out.println(b);
        
        String[] names = f3.list();
        System.out.println(Arrays.toString(names));
        
        
    }
}
