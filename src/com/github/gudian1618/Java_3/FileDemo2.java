package com.github.gudian1618.Java_3;

import java.io.File;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/26 21:46
 * @description
 * 在指定的目录中查找文件
 *
 */
public class FileDemo2 {
    
    public static void main(String[] args) {
        findFile(new File("D:\\"), ".jpg");
    
    }
    
    private static void findFile(File target, String ext) {
        if (target==null) return;
        if (target.isDirectory()) {
            File[] files = target.listFiles();
            if (files!=null) {
                for (File f:files) {
                    findFile(f,ext);
                }
            }
        } else {
            // 此处表示File是一个文件
            target.getName()
        
        }
    }
}
