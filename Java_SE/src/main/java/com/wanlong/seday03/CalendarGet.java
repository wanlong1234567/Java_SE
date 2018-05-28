package com.wanlong.seday03;
import java.util.Calendar;
/**
 *
 * int get(int field)
 * 获取当前Calendar中指定时间分量所对应的值。
 * 参数为指定的时间分量，对应Calendar提供的
 * 相关常量值。
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class CalendarGet {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获取年?
        int year = calendar.get(Calendar.YEAR);
        //获取月
        int month = calendar.get(Calendar.MONTH)+1;
        /*
         * 获取天
         * 和天相关的常量:
         * DATE:月中的天，与DAY_OF_MONTH一致
         * DAY_OF_MONTH:月中的天
         * DAY_OF_WEEK:星期中的天
         * DAY_OF_YEAR:年中的天
         */
        int day = calendar.get(Calendar.DATE);

        System.out.println(year+"-"+month+"-"+day);

        int h = calendar.get(Calendar.HOUR_OF_DAY);
        int m = calendar.get(Calendar.MINUTE);
        int s = calendar.get(Calendar.SECOND);
        System.out.println(h+":"+m+":"+s);


        int doy = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是今年的第:"+doy+"天");

        /*
         * 获取指定时间分量所允许的最大值
         */
        int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        System.out.println("今年一共"+days+"天");
        System.out.println("今年还剩:"+(days-doy)+"天");
    }
}
