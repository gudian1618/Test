package com.github.gudian1618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 17:09
 * @description
 */
public class JDK7Demo {
    
    public static void main(String[] args) {
        // 1.5之后的方法，输入
//        Scanner input = new Scanner(System.in);
        //1.7新特性
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("请输入数字：");
            String info = br.readLine();
            int num = Integer.parseInt(info);
            System.out.println(info);
        } catch (IOException|NumberFormatException e) {
            e.printStackTrace();
        }
    
    }
    
}



