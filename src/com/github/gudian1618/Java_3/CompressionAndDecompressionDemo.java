package com.github.gudian1618.Java_3;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/14 14:41
 * 压缩与解压缩
 */
public class CompressionAndDecompressionDemo {
    /*
     * 压缩
     * */
    private static void compression(String zipFileName, File targetFile) {
        System.out.println("正在压缩。。。");
        try {
            // 生成压缩文件
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            BufferedOutputStream bos = new BufferedOutputStream(out);
            // 创建压缩方法
            zip(out, targetFile, bos, targetFile.getName());
            bos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("压缩完成。。。");
    }
    
    private static void zip(ZipOutputStream zOut, File targetFile, BufferedOutputStream bos, String name) throws IOException {
        if (targetFile.isDirectory()) {
            File[] files = targetFile.listFiles();
            if (files.length == 0) {
                // 处理空目录
                zOut.putNextEntry(new ZipEntry(name + "/"));
            }
            for (File f : files) {
                zip(zOut, f, bos, name + "/" + f.getName());
            }
        } else {
            zOut.putNextEntry(new ZipEntry(name));
            InputStream in = new FileInputStream(targetFile);
            BufferedInputStream bis = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bis.close();
        }
    }
    
    /*
     * 解压
     * */
    private static void decompression() {
    
    }
    
    public static void main(String[] args) {
        compression("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\test.zip", new File("F:\\ProgramData\\Test\\src\\com\\github\\gudian1618\\Java_3\\a.avi"));
    }
}
