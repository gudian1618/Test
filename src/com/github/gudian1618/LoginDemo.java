package com.github.gudian1618;

import java.util.Scanner;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 16:29
 * @description
 *
 * 面试题：
 * Exception与RuntimeException的区别：
 * Exception：受检异常，在编译期检查，在调用抛出这个异常的方法时，
 *            必须显式的使用try..catch...
 * RuntimeException：非受检异常，在运行期检查，在调用抛出这个异常方法的时候，
 *                   可以不显示的使用try...catch...
 * 在使用自定义异常时，根据业务要求，决定使用哪个作为父类。
 *
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
