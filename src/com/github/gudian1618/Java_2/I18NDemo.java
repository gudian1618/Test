package com.github.gudian1618.Java_2;

import java.util.Locale;

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


    }
}
