package com.github.gudian1618.Java_3;

import java.io.*;
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
    
//    静态代码块，只会执行一次
    static {
//        readConfig();
    }
    
    /*
    * 对属性文件的写入操作
    * */
    
    private static void writeConfig(String version, String username, String password) {
        Properties p = new Properties();
        p.put("app.version", version);
        p.put("db.username", username);
        p.put("db.password", password);
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("config.properties");
//            写文件
            p.store(out, "update condig");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void readConfig() {
        Properties p = new Properties();
        
        try {
           InputStream inStream = new FileInputStream("config.properties");
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
        
        writeConfig("2.0", "mendeersong", "12345678");
//        readConfig();
        System.out.println(PropertiesDemo.version);
        System.out.println(PropertiesDemo.username);
        System.out.println(PropertiesDemo.password);
    }
}
