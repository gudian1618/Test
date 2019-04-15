package com.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/4/11 17:01
 */

import java.net.URLConnection;

/**
 * 多态性：对象在运行过程中的多种形态
 * 分为两类
 * 1、方法的重载与重写
 * 2、对象的多态性
 * 父类的引用指向子类（有多个扩展）
 * 向上转型：将子类的实例转为父类的实例
 * 父类 父类对象 = 子类实例 -> 自动转换
 *
 * 向下转型：将父类实例转为子类实例
 * 子类 子类对象 = （子类）父类实例 -> 强制转化
 *
 * 方法的重载和重写就是多态的表现
 * 多个子类就是父类中的多种形态
 * 父类引用可以指向子类对象，自动转换
 * 子类对象指向父类引用，需要强制转换
 * 实际开发中尽量使用父类引用，便与扩展
 *
 * 当需要把父类的实例强制转换为子类引用时，为了避免类型转换异常，
 * 我门需要在转换之前做类型检查（判断）instanceof
 *
 * 父类通常都设计为接口或抽象类，优先考虑接口，如果接口不能满足，在考虑抽象类
 * 一个具体的类尽可能的不去继承另一个具体的类，这样的好处就是无需检查对象是否为父类的对象
 *
 * 模板方法模式：定义算法的估价，可变部分延迟放到子类当中。模板方法模式可以使得子类不改变一个算法的步骤可以改变该算法的某些特定步骤
 *
 */

// 抽象类的模板方法

public class Test10 {
    public static void main(String[] args) {
        System.out.println();
        UserManager um = new UserManager();
//        um.action("admin","add");
        um.action("test","add");
    }
}

// 定义一个抽象类
abstract class BaseManager {
    // 具体的一个方法实现
    public void action(String name, String method) {
        if ("admin".equals(name)) {
            execute(method);
        } else {
            System.out.println("你没有操作权限，请联系管理员");
        }
    }
    // 抽象方法无实现，通过子类继承延迟实现
    public abstract void execute(String method);
}

// 定义一个实现的具体子类
class UserManager extends BaseManager{
    @Override
    public void execute(String method) {
        if ("add".equals(method)) {
            System.out.println("执行了添加操作");
        } else if ("del".equals(method)) {
            System.out.println("执行了删除操作");
        }
    }
}
