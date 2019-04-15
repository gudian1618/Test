package com.github.gudian1618;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @descript
 * @date 2019/4/12 8:32
 */

/**
 * 接口应用-策略模式
 * 定义了一系列的算法，将每一种算法封装并且可以相互替换使用，策略模式让算法独立于使用它的客户应用而独立变化
 * oo设计原则：
 * 面向接口（抽象）编程、封装变化、多用组合，少用继承
 *
 * 把可变的行为抽象出来，好处是这些行为算法相互替换，互相独立，没有彼此的影响，形成算法簇
 *
 */

public class Test11 {
    public static void main(String[] args) {
        BaseService user = new UserService();
//        user.setiSave(new NetSave());
        user.setiSave(new NetSave());
        user.add("user");
        
    }
}

// 把可变行为抽象出来，定义一些列的算法
interface ISave {
    public void save(String data);
}

class FileSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("把数据保存到文件中..."+data);
    }
}

class NetSave implements ISave {
    @Override
    public void save(String data) {
        System.out.println("把数据保存到网络上..."+data);
    }
}

abstract class BaseService {
    private ISave iSave;
    
    public void setiSave(ISave iSave) {
        this.iSave = iSave;
    }
    
    public void add(String data) {
        System.out.println("检查数据合法性...");
        iSave.save(data);
        System.out.println("数据保存完毕。");
    }
}

class UserService extends BaseService {

}