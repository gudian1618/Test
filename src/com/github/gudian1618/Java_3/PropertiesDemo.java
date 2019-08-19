package com.github.gudian1618.Java_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2019/8/19 11:25
 * properties类可以用来做配置文件
 * javaweb javase 开发中通常使用
 *
 */
public class PropertiesDemo {
    
    private static String version = "";
    private static String username = "";
    private static String password = "";
    
    private static void readConfig() {
        Properties p = new Properties();
    
        FileInputStream inStream = null;
        try {
            inStream = new FileInputStream("config.properties");
            p.load(inStream);
            
//            从properties中获取数据
            version = p.getProperty("app.version");
            username = p.getProperty("db.username");
            password = p.getProperty("db.password");
            
            inStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        readConfig();
        System.out.println(PropertiesDemo.version);
        System.out.println(PropertiesDemo.username);
        System.out.println(PropertiesDemo.password);
    }
}
