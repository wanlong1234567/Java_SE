package com.wanlong.seday10;

/**
 * 线程提供了一个方法:
 * void join()
 * 该方法允许一个线程在另一个线程上等待，直到其
 * 完成工作后才解除阻塞继续运行。
 * 所以join可以协调线程之间同步运行。
 *
 * 同步与异步
 * 同步运行指代码运行是有先后顺序的执行。
 * 异步运行指代码与代码见是"各干各的"，互不影响。
 *
 * 多线程并发是异步运行代码的。但有时候又需要这些
 * 线程间的代码同步运行时可以使用join完成线程间
 * 同步。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Thread_join {
    /**
     *  表示图片是否下载完毕
     */
    public static boolean isFinish;

    public static void main(String[] args) {
        /**
         * 当一个方法的局部内部类中想引用这个方法的
         * 其他局部变量，那么该局部变量必须是final的
         * 这是由于JVM内存分配问题，JAVA8以后没有此
         * 问题。
         */
        final Thread download = new Thread(){
            @Override
            public void run(){
                System.out.println("down:开始下载图片...");
                for(int i=1;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("down:图片下载完毕!");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            @Override
            public void run(){
                System.out.println("show:开始显示图片");
                //等待下载线程将图片下载完毕
                try {
                    /**
                     * 当show线程调用download.join()方法
                     * 方法后就进入了阻塞状态，直到download
                     * 执行完毕才会解除阻塞继续运行后续代码。
                     */
                    download.join();
                } catch (InterruptedException e) {
                }

                if(!isFinish){
                    throw new RuntimeException("图片没有下载完毕!");
                }
                System.out.println("show:图片显示完毕");
            }
        };


        download.start();
        show.start();
    }
}
