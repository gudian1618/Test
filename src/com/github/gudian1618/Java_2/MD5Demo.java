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
    // 存储的密文
    private static String savePassword = "4QrcOUm6Wau+VuBX8g+IPg==";
    public static void main(String[] args) {
    
//        test();
        System.out.println(login("12345678"));
    
    }
    
    private static boolean login(String password) {
        if(savePassword.equals(md5(password))) {
            return true;
        } else {
            return false;
        }
    }
    
    // 计算MD5的工具方法
    private static String md5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            // 通过md5计算摘要
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            String str2 = Base64.getEncoder().encodeToString(bytes);
            return str2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static void test() {
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
