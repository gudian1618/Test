package com.github.gudian1618.Java_6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/9/19 11:00
 */
public class URLDemo {

    public static void main(String[] args) {
        try {
            URL url = new URL("F:/Python%203.7.4%20帮助/python3.7x/docs.python.org/zh-cn/3/index.html");
            URLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("F:\\ProgramData" +
                "\\Test\\src\\com\\github\\gudian1618\\Java_6\\a.jpg"));
            byte[] bytes = new byte[1024];
            int len =-1;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
                out.flush();
            }
            in.close();
            out.close();
            System.out.println("下载成功！");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
