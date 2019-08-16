package com.github.gudian1618.Java_3;

import java.io.UnsupportedEncodingException;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/16 16:41
 * 通常产生乱码的情况是，两个不兼容的编码相互转换
 */
public class CodeDemo {
    
    public static void main(String[] args) {
        String info = "小河流水哗啦啦";
        try {
            String newInfo = new String(info.getBytes("gb2312"),"iso8859-1");
            System.out.println(newInfo);
    
            String newInfo2 = new String(newInfo.getBytes("iso8859-1"),"gb2312");
            System.out.println(newInfo2);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
