package com.wanlong.seday08;

import com.wanlong.seday07.Person;

/**
 * 测试异常的抛出
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Exception_throw {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            /**
             * 当调用一个含有throws声明异常抛出
             * 的方法时，编译器要求必须有处理该
             * 异常的手段，没有则编译不通过。
             * 处理手段有两种:
             * 1:使用try-catch捕获并处理该异常
             * 2:在当前方法上继续使用throws将
             *   该异常抛出。
             *
             */
            p.setAge(1000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(p.getAge());
    }
}
