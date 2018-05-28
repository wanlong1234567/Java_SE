package com.wanlong.seday10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题:
 * 1:控制线程数量
 *   每条线程都需要占用一部分内存，线程数量越多占用
 *   内存资源越多，并且线程多了以后CPU轮询时间会
 *   边长形成CPU过度切换。这些都会导致系统变慢，甚
 *   至瘫痪
 * 2:重用线程
 *   频繁创建销毁线程也会给线程调度带来负担。尽量
 *   重用线程，减小系统开销。
 *
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool
                = Executors.newFixedThreadPool(2);

        for(int i=0;i<5;i++){
            Runnable r = new Runnable(){
                @Override
                public void run(){
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(
                                t.getName()+":正在执行任务...");
                        /**
                         * 当一个正在阻塞的线程被中断时，会
                         * 抛出中断异常InterruptedException
                         */
                        Thread.sleep(5000);
                        System.out.println(
                                t.getName()+":运行任务完毕!");
                    } catch (InterruptedException e) {
                        System.out.println("线程被中断了！");
                    }
                }
            };
            threadPool.execute(r);
            System.out.println("将一个任务指派给线程池");
        }

        /**
         * shutdown()和shutdownNow()
         * 前者调用完毕后，线程池不再接受新的任务
         * 并且会将池中剩余任务都执行完毕后自行停
         * 止。
         * 后者调用后，线程池会强制中断池中所有线
         * 程并立即停止线程池。
         */
        threadPool.shutdownNow();
        System.out.println("线程池已停止!");
    }
}
