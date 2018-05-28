package com.wanlong.seday09;

/**
 * 线程提供了一个静态方法:
 * static Thread currentThread
 * 该方法可以获取运行该方法的线程
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Thread_currentThread {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(
                "运行main方法的线程是:"+main
        );
        dosome();

        Thread t = new Thread(){
            @Override
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("自定义线程:"+t);
                dosome();
            }
        };
        t.start();

    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程是:"+t);
    }
}
