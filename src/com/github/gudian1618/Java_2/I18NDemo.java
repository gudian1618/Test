package com.github.gudian1618.Java_2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-11 20:11
 * @description
 *
 *
 */

public class I18NDemo {
    public static void main(String[] args) {
        // 创建一个本地语言环境对象，该对象会根据参数设置来自动选择与之相关的语言环境
        // 参数：语言，地区
        Locale locale_CN = new Locale("zh","CN");
        Locale locale_US = new Locale("en","US");
        // 获取当前系统默认的语言环境
        Locale locale_defualt = Locale.getDefault();

        Scanner input = new Scanner(System.in);
        // 用于绑定属性文件的工具类（参数：属性文件的基本名）
        ResourceBundle r = ResourceBundle.getBundle(("com.github.gudian1618" +
                ".Java_2.info"),locale_US);
        System.out.println(r.getString("system.name"));
        System.out.println(r.getString("input.username"));
        String username = input.nextLine();
        System.out.println(r.getString("input.password"));
        String password = input.nextLine();

        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println(r.getString("login.success"));
        } else {
            System.out.println(r.getString("login.error"));

        }
    }
}
