package com.wanlong.seday03;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个时间点。
 * 由于Date存在设计缺陷，所以大部分操作时间的方法都
 * 被声明为过时的，不再建议使用。
 * Date的每一个实例内部维护着一个long值，该值表示
 * 的是自1970年1月1日 00:00:00到该实例表示的日期
 * 之间所经过的毫秒。
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class DateDemo {
    public static void main(String[] args) {
        /**
         * 默认创建的Date表示当前系统时间
         */
        Date date = new Date();
//		Date date = new Date(1000);
        System.out.println(date);

        //Date大部分方法都是过时的，不再使用
//		date.getYear();

        /**
         * long getTime()
         * 获取当前Date对象内部维护的毫秒值
         */
        long time = date.getTime();
        System.out.println(time);
        long days = time/1000/60/60/24;
        System.out.println("从1970年到现在经过了"+days+"天");

        /**
         * void setTime(long ms)
         * 给定一个long值，使得当前Date对象表示
         * 该日期
         */
        //表示明天这一刻的时间
        time+=1000*60*60*24;
        date.setTime(time);
        System.out.println(date);
    }
}
