package com.wanlong.seday10;

/**
 * 互斥锁
 * synchronized修饰不同的代码片段，当同步监视器
 * 对象是相同的时候，这些代码片段之间就是互斥的。
 * 多个线程不能同时进到这些代码片段中一起执行。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        final Boo b = new Boo();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                b.methodA();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                b.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在运行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":运行A方法完毕");
        } catch (Exception e) {
        }
    }
    public synchronized void methodB(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在运行B方法");
            Thread.sleep(5000);
            System.out.println(t.getName()+":运行B方法完毕");
        } catch (Exception e) {
        }
    }
}
