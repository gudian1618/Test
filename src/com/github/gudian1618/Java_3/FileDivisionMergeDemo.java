package com.github.gudian1618.Java_3;

import java.io.*;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/13 11:08
 */
public class FileDivisionMergeDemo {
    
    private static void division(File targetFile, long cutSize) {
        if (targetFile == null) return;
        // 计算总分割的文件
        int num = (targetFile.length() % cutSize == 0) ? (int) (targetFile.length() / cutSize) : (int) (targetFile.length() / cutSize + 1);
        // 构造一个文件输入流
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(targetFile));
            BufferedOutputStream out = null;
            
            // 每次读取的字节数
            byte[] bytes = null;
            int len = -1;
            // 每一个文件读取的次数
            int count = 0;
            
            for (int i = 0; i < num; i++) {
                out = new BufferedOutputStream(new FileOutputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\" + (i + 1) + "-temp-" + targetFile.getName())));
                if (cutSize <= 1024) {
                    bytes = new byte[(int) cutSize];
                    count = 1;
                } else {
                    bytes = new byte[1024];
                    count = (int) cutSize / 1024;
                }
                
                while (count > 0 && (len=in.read(bytes))!=-1) {
                    out.write(bytes,0,len);
                    out.flush();
                    count--;
                }
                
                if (cutSize%1024!=0) {
                    bytes = new byte[(int) cutSize % 1024];
                    len = in.read(bytes);
                    out.write(bytes, 0, len);
                    out.flush();
                    out.close();
                }
                in.close();
            }
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void merge() {
    
    
    }
    
    
    public static void main(String[] args) {
        File file = new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\a.mp4");
        division(file, 1024*1024*10);
    }
}
