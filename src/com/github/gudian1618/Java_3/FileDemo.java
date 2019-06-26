package com.github.gudian1618.Java_3;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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
        
        // 列出当前目录下所有的文件名
        String[] names = f3.list();
        System.out.println(Arrays.toString(names));
        
        // 列出当前目录下所有文件，以file对象返回
        File[] fs = f3.listFiles();
        for(File f: fs) {
            System.out.println("length:"+f.length());
            System.out.println("name:"+f.getName());
            System.out.println("相对路径:"+f.getPath());
            System.out.println("绝对路径:"+f.getAbsolutePath());
            System.out.println("是否为隐藏文件:"+f.isHidden());
            System.out.println("是否为可读文件:"+f.canRead());
            Date date = new Date(f.lastModified());
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            System.out.println("文件最后的修改时间:"+df.format(date));
            System.out.println("---------------------------");
        }
        
        File f4 = new File("temp.txt");
        System.out.println(f4.getPath());
        System.out.println(f4.getAbsolutePath());
        
        File f5 = new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3/dabin");
        f5.mkdir();
        
        f5.renameTo(new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3/dabin1"));
        
        f5.renameTo(new File("F:/ProgramData/Test/src/com/github/gudian1618/Java_3/temp/dabin"));
        
        File[] files = f5.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });
        System.out.println("----------");
        for (File f:files) {
            System.out.println(f.getName());
        }
    
    }
}
