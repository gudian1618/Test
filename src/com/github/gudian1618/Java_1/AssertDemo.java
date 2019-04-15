package com.github.gudian1618.Java_1;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @company www.github.com
 * @date 2019/4/15 17:04
 * @description
 *
 * assert 断言测试 ，需要在run配置里，vm加入-ea使能参数，用于启动
 *
 */
public class AssertDemo {
    public static void main(String[] args) {
        int result = add(10, 10);
        assert result==10:"结果不正确";
    }
    
    private static int add(int a, int b) {
        return a+b+1;
    }
}
