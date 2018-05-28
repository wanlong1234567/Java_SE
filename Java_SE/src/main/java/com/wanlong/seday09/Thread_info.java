package com.wanlong.seday09;

/**
 * 获取线程相关信息的方法
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Thread_info {
    public static void main(String[] args) {
        //获取运行main方法的线程
        Thread t = Thread.currentThread();

        //获取线程名字
        String name = t.getName();
        System.out.println("name:"+name);

        //获取线程ID(唯一标示)
        long id = t.getId();
        System.out.println("id:"+id);

        //线程优先级
        int priority = t.getPriority();
        System.out.println("优先级:"+priority);

        //线程活动状态
        boolean isAlive = t.isAlive();

        //是否为守护线程
        boolean isDaemon = t.isDaemon();

        //是否被中断
        boolean isInterrupted = t.isInterrupted();
        System.out.println("isAlive:"+isAlive);
        System.out.println("isDaemon:"+isDaemon);
        System.out.println("isInterrupted:"+isInterrupted);

    }
}
