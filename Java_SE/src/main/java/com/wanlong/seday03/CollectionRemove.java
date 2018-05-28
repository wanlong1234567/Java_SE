package com.wanlong.seday03;

import com.wanlong.seday02.Point;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * 删除集合元素
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionRemove {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(1,2));
        System.out.println(c);

        Point p = new Point(1,2);
        /**
         * boolean remove(E e)
         * 从当前集合中删除指定元素。成功删除则
         * 返回true
         * 需要注意，该方法只会删除一个元素，并且
         * 删除的是集合中与给定元素equals比较true
         * 的。若有多个，则删除第一个比较为true的。
         *
         */
        c.remove(p);
        System.out.println(c);

    }
}
