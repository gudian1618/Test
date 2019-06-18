package com.github.gudian1618.Java_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/6/18 15:24
 * @description
 */
public class SystemRuntimeDemo {
    public static void main(String[] args) {
        
        System.out.println("向控制台正常输出");
        System.err.println("出错啦");
        
        int[] num1 = {1,2,34,5,6,7,8};
        int[] num2 = new int[num1.length];
        // 参数（源数组，原数组的起始位置，目标数组，目标数组的起始位置，长度）
        System.arraycopy(num1, 0, num2, 0, num1.length);
        System.out.println(Arrays.toString(num2));
        // 当前时间毫秒数
        System.out.println(System.currentTimeMillis());
        Date nowDate = new Date(System.currentTimeMillis());
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        String q = df.format(nowDate);
        System.out.println(q);
        
    }
}
