package com.wanlong.seday05;
import java.util.LinkedList;
import java.util.Queue;
/**
 * java.util.Queue
 * 队列
 * 队列可以存放一组元素，存取元素必须遵循:FIFO
 * 即:First Input First Output 先进先出
 *
 * Queue接口继承自Collection
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue
                = new LinkedList<String>();
        /**
         * boolean offer(E e)
         * 入队操作，将给定元素添加到队列末尾
         */
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        queue.offer("six");
        System.out.println(queue);
        /**
         * E poll()
         * 出队操作，取出队首元素，取出后该元素
         * 就从队列中被删除。
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        /**
         * E peek()
         * 引用队首元素，获取队首元素，但是该元素
         * 还在队列中
         */
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /**
         * 使用迭代器遍历队列元素，元素还在队列中
         */
        for(String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);

        /**
         * 取出后就删除
         */
        while(queue.size()>0){
            String s = queue.poll();
            System.out.println(s);
        }
        System.out.println(queue);
    }
}
