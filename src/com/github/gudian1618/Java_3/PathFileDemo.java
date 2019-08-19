package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 15:22
 * 采用NIO的方式对文件进行操作，读写，剪切、复制、粘贴
 */
public class PathFileDemo {
    
    public static void main(String[] args) {
        File file = new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\lianxi.txt");

//        path
        Path p1 = Paths.get("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3", "lianxi.txt");
        System.out.println(p1);
        
        Path p2 = file.toPath();
        System.out.println(p2);
        
        Path p3 = FileSystems.getDefault().getPath("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3", "lianxi.txt");
        System.out.println(p3);

//        Files工具类，采用NIO的方式
//        写入文件
        Path p4 = Paths.get("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\lianxi.txt");
        String info = "村花到我家,一起。。。";
        try {
            Files.write(p4, info.getBytes("utf-8"), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        读取文件
        try {
            byte[] bytes = Files.readAllBytes(p4);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }

////        复制文件
//        try {
//            Files.copy(p3, Paths.get("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\lianxi.txt"), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    
//        // 移动文件
//        try {
//            Files.move(p3, Paths.get("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\lianxi.txt"), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
//        // 删除文件
//        try {
//            Files.delete(p3);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    
//        创建新目录，除了最后一个部件，其他必须是已存在的
        try {
            Files.createDirectory(Paths.get("F:\\\\ProgramData\\\\Test\\\\src\\\\com\\\\github\\\\gudian1618\\\\Java_3\\BB"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
