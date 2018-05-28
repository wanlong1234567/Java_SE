package com.wanlong.seday05;
import java.util.Deque;
import java.util.LinkedList;
/**
 * 双端队列 Deque
 * Deque接口继承自Queue
 * 双端队列就是两端都可以进出队的队列
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque
                = new LinkedList<String>();
        deque.offer("one");
        deque.offer("two");
        System.out.println(deque);

        deque.offerFirst("three");
        System.out.println(deque);

        deque.offerLast("four");
        System.out.println(deque);

        String str = deque.poll();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollLast();
        System.out.println(str);
        System.out.println(deque);

        str = deque.pollFirst();
        System.out.println(str);
        System.out.println(deque);

    }
}
