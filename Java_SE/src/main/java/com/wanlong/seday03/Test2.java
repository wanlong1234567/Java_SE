package com.wanlong.seday03;
import java.util.*;
/**
 * 查看自己生日是那年的第几天?
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1992);
        calendar.set(Calendar.MONTH,7);
        calendar.set(Calendar.DAY_OF_MONTH,4);
        System.out.println(calendar.getTime());

        int days = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(
                "您的生日是"+calendar.get(Calendar.YEAR)
                        +"年的第"+days+"天"
        );

        String[] data = {"日","一","二","三","四","五","六"};
        int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("那天是星期"+data[dow]);
    }
}
