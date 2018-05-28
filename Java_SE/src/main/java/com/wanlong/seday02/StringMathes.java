package com.wanlong.seday02;

import java.util.Scanner;

/**
 *
 * 字符串支持正则表达式的相关方法之一:
 * boolean matches(String regex)
 * 使用给定的正则表达式匹配当前字符串的格式是否
 * 满足该正则表达式要求，满足则返回true
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringMathes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入email地址:");
        String email = scanner.nextLine();
        /*
         * email正则表达式:
         * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
         *
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
        System.out.println(regex);

        /**
         * String提供的macthes方法传入的正则
         * 表达式就算不加边界符(^$)也是做全匹配
         * 验证
         */
        boolean tf = email.matches(regex);
        if(tf){
            System.out.println("是邮箱地址");
        }else{
            System.out.println("邮箱地址格式不正确!");
        }
    }
}
