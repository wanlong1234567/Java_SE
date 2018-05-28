package com.wanlong.seday09;

/**
 * 线程的优先级
 *
 * 线程优先级有10个等级，分别用整数1-10表示。
 * 其中1最低，10最高，5为默认优先级。
 *
 * 由于线程不能干涉线程调度工作，即：不能主动获取
 * CPU时间，也不能决定时间片长短。
 * 所以只能通过调整优先级来最大程度改善获取CPU时间
 * 片的几率。
 * 理论上线程优先级越高的线程，获取CPU时间片的次数
 * 就越多。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Thread_setPriority {
    public static void main(String[] args) {
        Thread max = new Thread(){
            @Override
            public void run(){
                for (int i = 0;i<10000;i++) {
                    System.out.println("max");
                }
            }
        };
        Thread min = new Thread(){
            @Override
            public void run(){
                for (int i = 0;i<10000;i++) {
                    System.out.println("min");
                }
            }
        };
        Thread norm = new Thread(){
            @Override
            public void run(){
                for (int i = 0;i<10000;i++) {
                    System.out.println("nor");
                }
            }
        };

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
       // norm.setPriority(5);
        min.start();
        norm.start();
        max.start();
    }
}
