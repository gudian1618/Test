package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @description
 * @create 2019-04-12 21:25
 */

public class Test_2 {
    public static void main(String[] args) {
        // 使用被使用者之间，耦合，产生了依赖，当被使用者被改变时，会影响使用者
        // 使用工厂模式来降低两者之间的依赖耦合
        Product phone = ProductFactory.getProduct("phone");
        if (null!=phone) {
            phone.work();
        }
    }
}

// 工厂类
class ProductFactory {
    public static Product getProduct(String name) {
        if ("phone".equals(name)) {
            return new Phone();
        } else if ("computer".equals(name)) {
            return new Computer();
        } else {
           return null;
        }
    }
}

interface Product {
    public void work();
}

class Phone implements Product {
    @Override
    public void work() {
        System.out.println("手机开始工作...");
    }
}

class Computer implements Product {
    @Override
    public void work() {
        System.out.println("电脑开始工作了...");
    }
}


