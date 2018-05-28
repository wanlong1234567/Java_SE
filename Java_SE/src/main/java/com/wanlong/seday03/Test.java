package com.wanlong.seday03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *  * 程序启动后，要求用户输入自己的生日，
 * 格式:yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止，一共活了多少天
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的生日:");//1996-03-18
        String birthStr = scanner.nextLine();

        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "yyyy-MM-dd"
        );
        //生日
        Date birth = sdf.parse(birthStr);
        //当前系统时间
        Date now = new Date();
        //计算相差的毫秒
        long time = now.getTime()-birth.getTime();
        //换算成天
        time = time/1000/60/60/24;

        System.out.println("恭喜您!已经活了"+time+"天!请继续保持!");


        //生日的毫秒
        time = birth.getTime();
        time += 10000L*1000*60*60*24;
        birth.setTime(time);

        String str = sdf.format(birth);
        System.out.println("出生10000天的纪念日是:"+str);
    }
}
