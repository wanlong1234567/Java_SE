package com.wanlong.seday08;

/**
 * 异常的一些方法
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8  2018/5/27
 * @version 1.0
 */
public class Exception_API {
    public static void main(String[] args) {
        System.out.println("程序开始了.");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            /**
             * 输出错误堆栈信息，有助于定位出错的代码
             * 以便调整程序错误。
             */
            e.printStackTrace();
            /**
             * 获取错误消息，通常是该错误出现的原因。
             */
            String message = e.getMessage();
            System.out.println(message);

        }
        System.out.println("程序结束了.");
    }
}
