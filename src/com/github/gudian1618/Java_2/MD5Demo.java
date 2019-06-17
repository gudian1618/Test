package com.github.gudian1618.Java_2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/17 21:52
 * @description
 */
public class MD5Demo {
    public static void main(String[] args) {
        
        String password = "123456";
        
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            // 通过MD5计算摘要
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            System.out.println(Arrays.toString(bytes));
            String mdStr = new String(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    
    }
    
}
