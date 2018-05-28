package com.wanlong.seday10;

/**
 * 多线程并发安全问题
 * 由于线程之间运行是异步的，互相没有牵制，但如果
 * 同时访问同一资源时就出现了“抢”的现象。由于线程
 * 发生切换现象的实际不确定导致代码执行顺序可能未
 * 按照设计的顺序执行，出现一系列的不可预知后果。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class SyncDemo {
    public static void main(String[] args) {
        final Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();//模拟线程发生了切换
                    System.out.println(
                            getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();//模拟线程发生了切换
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;
    /**
     * 当一个方法被synchronized修饰后，该方法称为
     * 同步方法，即:多个线程不能同时进入到方法内部
     * 去执行代码。这样就不会同时对beans这个数据
     * 进行操作，没有抢的问题，就不会出现并发安全
     * 问题了。
     *
     * 在一个方法上使用synchronized修饰，那么
     * 同步监视器对象就是该方法所属对象，即方法
     * 内部看到的this
     * @return
     */
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("没有豆子了!");
        }
        Thread.yield();//模拟线程发生了切换
        return beans--;
    }
}
