package com.wanlong.seday03;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * java.util.Calendar
 * 日历类
 * 日历类用于操作时间
 * 常见实现类GregorianCalendar,即:阳历
 *
 * Calendar提供了静态方法:getInstance用于获取
 * 一个当前系统所在地区适用的实现类，大部分地区
 * 返回的都是阳历历法实现类
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class CalendarGetInstace {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        /**
         * Calendar提供了方法:
         * Date getTime()
         * 该方法会返回一个Date对象，该对象所表示的
         * 日期就是当前Calendar所表示的日期。
         *
         *
         * void setTime(Date date)
         * 使用给定的Date来设置当前Calendar表示
         * 的日期。
         *
         *
         */
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
