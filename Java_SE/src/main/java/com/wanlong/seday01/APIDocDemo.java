package com.wanlong.seday01;

/**
 * 文档注释只定义在三个地方:
 * 类，常量，方法上
 * 在类上定义文档注释是用来说明这个类的设计以及
 *其解决的问题等相关描述信息。
 *
 *@author wanlong
 * Date:2018/5/15
 * @version 1.0
 * @since JDK1.8
 */
public class APIDocDemo {
    /**
     * sayHello方法中的问候语
     */
    public static final String INFO = "你好!";

    /**
     * 为给定的用户添加一个问候语
     * @param user 给定的用户的名字
     * @return 返回含有问候语的字符串
     */
    public String sayHello(String user){
        return INFO + user;
    }
}
