package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/13 11:08
 */
public class FileDivisionMergeDemo {
    
    private static void division(File targetFile, long cutSize) {
        if(targetFile==null) return;
        // 计算总分割的文件
        int num = (targetFile.length()%cutSize==0)?(int)(targetFile.length()/cutSize):(int)(targetFile.length()/cutSize+1);
        // 构造一个文件输入流
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream out = null;
            
            byte[] bytes = null;
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private static void merge() {
    
    
    }
    
    
    public static void main(String[] args) {
        File file = new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\FileDivisionMergeDemo.java");
    }
}
