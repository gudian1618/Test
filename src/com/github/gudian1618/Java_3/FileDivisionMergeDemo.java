package com.github.gudian1618.Java_3;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

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
            // 每次实际读取的长度
            int len = -1;
            // 每一个文件读取的次数
            int count = 0;
            // 循环次数为生成文件的个数
            for (int i = 0; i < num; i++) {
                out = new BufferedOutputStream(new FileOutputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\" + (i + 1) + "-temp-" + targetFile.getName())));
                if (cutSize <= 1024) {
                    bytes = new byte[(int) cutSize];
                    count = 1;
                } else {
                    bytes = new byte[1024];
                    count = (int) cutSize / 1024;
                }
                
                while (count > 0 && (len = in.read(bytes)) != -1) {
                    out.write(bytes, 0, len);
                    out.flush();
                    count--;
                }
                // 计算每个文件的小于规定的1024条件时，决定是否要再读一次
                if (cutSize % 1024 != 0) {
                    bytes = new byte[(int) cutSize % 1024];
                    len = in.read(bytes);
                    out.write(bytes, 0, len);
                    out.flush();
                    out.close();
                }
            }
            in.close();
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void merge(Enumeration<InputStream> es) {
        // 构造一个合并流
        SequenceInputStream sis = new SequenceInputStream(es);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\合并后的文件.avi"));
            // 具体读取业务
            byte[] bytes = new byte[1024];
            int len =-1;
            while ((len=sis.read(bytes))!=-1) {
                bos.write(bytes,0,len);
                bos.flush();
            }
            bos.close();
            sis.close();
            System.out.println("合并完成！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    
//        File file = new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\a.avi");
//        division(file, 1024 * 1024);
    
        try {
            InputStream in1 = new FileInputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\1-temp-a.avi"));
            InputStream in2 = new FileInputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\2-temp-a.avi"));
            InputStream in3 = new FileInputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\3-temp-a.avi"));
            InputStream in4 = new FileInputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\4-temp-a.avi"));
            InputStream in5 = new FileInputStream(new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\5-temp-a.avi"));
            
            // 集合工具类，内部实现用了数组
            Vector<InputStream> v = new Vector<InputStream>();
            v.add(in1);
            v.add(in2);
            v.add(in3);
            v.add(in4);
            v.add(in5);
    
            Enumeration<InputStream> es = v.elements();
            merge(es);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
    }
}
