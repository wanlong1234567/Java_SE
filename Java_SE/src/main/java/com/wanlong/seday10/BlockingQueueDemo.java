package com.wanlong.seday10;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
/**
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingDeque<String> queue
                = new LinkedBlockingDeque<String>();

        queue.offer("");

        queue.poll();
    }
}
