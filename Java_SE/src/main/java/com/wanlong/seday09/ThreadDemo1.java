package com.wanlong.seday09;

/**
 * 多线程
 * 多线程允许多段代码"同时"(并发)运行。
 *
 * 创建线程有两种方式，方式一:
 * 继承Thread并重写run方法。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /**
         * 启动线程调用start方法。不要直接调用
         * 线程的run方法。
         * 当start方法执行完毕后，线程纳入线程
         * 调度，一旦该线程获取CPU时间片开始运行
         * 时会自动调用自己的run方法开始工作。
         */
        t1.start();
        t2.start();
    }
}
/**
 * 第一种创建线程的方式有两个不足:
 * 1:由于java是单继承，这就导致继承了Thread就
 *   不能再继承其他类。实际开发中会导致诸多不便。
 * 2:由于将run方法重写，把线程要执行的任务代码
 *   定义在了run方法中，就导致该线程与任务有一个
 *   必然的耦合关系。不利于线程的重用。
 * @author adminitartor
 *
 */
class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("我是查水表的!");
        }
    }
}