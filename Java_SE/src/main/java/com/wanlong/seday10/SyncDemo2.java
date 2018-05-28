package com.wanlong.seday10;

/**
 * 有效的缩小同步范围可以在保证并发安全的前提下
 * 尽可能提高并发效率
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }
}


class Shop{
    //	public synchronized void buy(){
    public void buy(){
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName()+":正在挑选衣服...");
            Thread.sleep(5000);
            /**
             * 同步块可以更精确的指定需要同步的代码片段。
             *
             * 若希望多个线程同步执行里面的代码，就需要在
             * 同步块中指定的"同步监视器(即:上锁的对象)"
             * 必须是同一个才可以。
             *
             * 这里由于t1,t2调用的是同一个shop的buy方法，
             * 所以这里两个线程看到的this都是这个shop对象
             * 那么这个同步块就具有了同步效果。
             */
            synchronized (this) {
                System.out.println(t.getName()+":正在试衣服...");
                Thread.sleep(5000);
            }
            System.out.println(t.getName()+":结账离开");


        } catch (Exception e) {
        }
    }
}
