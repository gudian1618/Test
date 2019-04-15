package com.github.gudian1618;

import java.util.Scanner;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 16:29
 * @description
 */
public class LoginDemo {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.nextLine();
        System.out.println("请输入密码：");
        String pass = input.nextLine();
        
        UserServiceNew us = new UserServiceNew();
        try {
            User user = us.Login(name, pass);
            System.out.println("登陆成功");
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
