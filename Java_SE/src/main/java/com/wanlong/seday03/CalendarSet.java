package com.wanlong.seday03;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 对指定的时间分量设置指定的值
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class CalendarSet {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        /**
         * 设置为2008-08-08 20:08:08
         */
        //设置年
        calendar.set(Calendar.YEAR, 2008);
        calendar.set(Calendar.MONTH,Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH,8);
        calendar.set(Calendar.HOUR_OF_DAY,20);
        calendar.set(Calendar.MINUTE,8);
        calendar.set(Calendar.SECOND,8);
        System.out.println(calendar.getTime());
        /**
         * 设置某些时间分量的值可能导致其他时间
         * 分量值的变化
         * 例如:设置了周几后，对应的日期也会改变
         */
        calendar.set(Calendar.DAY_OF_WEEK,4);
        System.out.println(calendar.getTime());
        /**
         * 可以设置时间分量对应的值超过其范围，
         * Calendar会自动进位。
         */
        calendar.set(Calendar.DAY_OF_MONTH,32);
        System.out.println(calendar.getTime());
    }
}
