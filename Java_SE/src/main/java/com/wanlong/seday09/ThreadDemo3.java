package com.wanlong.seday09;

/**
 * 使用匿名内部类完成线程的两种方式创建
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("你是谁啊?");
                }
            }
        };
        Runnable r2 = new Runnable(){
            @Override
            public void run(){
                for(int i =0;i<1000;i++){
                    System.out.println("我是查水表的!");
                }
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

