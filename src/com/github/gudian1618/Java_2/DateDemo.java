package com.github.gudian1618.Java_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @param
 * @author gudian1618
 * @version 1.0
 * @date 2019-05-03 22:51
 * @description
 * Date Calender 类
 *
 */

public class DateDemo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        //使用两个构造方法
        // Date(long date) 参数是毫秒
        // Date()

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();

        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int millisecond = c1.get(Calendar.MILLISECOND);
        StringBuilder sb = new StringBuilder(50);
        sb.append(year).append("年").append(month).append("月").append(day).append("日").append(hour).append("时").append(minute).append("分钟").append(second).append("秒").append(millisecond).append("毫秒");
        System.out.println(sb.toString());

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String nowDate = df.format(new Date());
        System.out.println(nowDate);


    }
}
