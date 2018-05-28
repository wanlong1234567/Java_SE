package com.wanlong.seday10;

/**
 * 静态方法使用synchorinzed修饰后，该方法一定具有
 * 同步效果。
 *
 * 静态方法上使用synchronized修饰后，同步监视器
 * 对象是当前类的类对象。
 * JVM在加载每个类的时候，都会实例化一个且只实例化
 * 一个Class的实例用来描述这个类。而静态方法锁的
 * 就是这个对象。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                Foo.dosome();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                Foo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo{
    public synchronized static void dosome(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在运行dosome方法...");
            Thread.sleep(5000);
            System.out.println(t.getName()+":运行dosome方法完毕!");
        } catch (Exception e) {

        }
    }
}
