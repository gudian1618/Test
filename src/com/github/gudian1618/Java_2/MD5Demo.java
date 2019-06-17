package com.github.gudian1618.Java_2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

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
        String savePassword = "4QrcOUm6Wau+VuBX8g+IPg==";
        
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            // 通过MD5计算摘要
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            System.out.println(Arrays.toString(bytes));
            String mdStr = new String(bytes);
            System.out.println(mdStr);
            // 1.8版本之后，编解码的方法
            String str = Base64.getEncoder().encodeToString(bytes);
            System.out.println(str);
            
            byte[] str1 = Base64.getDecoder().decode(str);
            System.out.println(Arrays.toString(str1));
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    
    }
    
}
