package com.wanlong.seday09;

/**
 * 守护线程
 * 当一个进程结束时，所有在运行的守护线程会强制结束
 * 当一个进程中所有前台线程结束时，进程结束。
 * 所以通常会将可以一直运行的任务，但是当程序主要
 * 工作都结束时可以一起结束的任务放在守护线程上运行。
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Thread_setDaemon {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            @Override
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊AAAAAAAaaaaa.....");
                System.out.println("效果:噗通");
            }
        };

        Thread jack = new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("jack:you jump! i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //设置后台线程要在start之前设置
        jack.setDaemon(true);

        rose.start();
        jack.start();

    }
}
