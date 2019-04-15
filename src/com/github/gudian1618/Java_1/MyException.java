package com.github.gudian1618.Java_1;


/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 15:13
 * @description
 *
 * 自定义异常通常都是继承一个异常类来实现，比如继承Exception父类
 * 通常的实现是，重写父类的构造方法
 * 异常对象本身没有实际的功能，只是一个有意义的标识、分类
 *
 *
 */
public class MyException extends Exception{
    
        public MyException() {
            super();
        }
        
        public MyException(String message) {
            super(message);
        }
}
