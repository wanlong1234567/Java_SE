package com.wanlong.seday04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 遍历集合元素
 *
 * 集合提供统一的遍历元素的方式:迭代器模式
 *
 * 集合提供了用于获取遍历当前集合元素的方法：
 * Iteartor iterator()
 *
 * java.util.Iterator
 * 迭代器的接口，规定了遍历集合的方法，遵循的模式
 * 为:问，取，删的步骤
 * 其中删除元素不是必须操作。
 *
 * 不同的集合实现类都提供了一个可以遍历自身的迭代器
 * 实现类。我们无需记住它们的名字，当他们的Iterator
 * 看待即可。
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class Collectioniteratot {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        System.out.println(c);  //获取用于遍历该集合的迭代器
        Iterator it = c.iterator();
        /**
         * boolean hasNext()
         * 判断集合是否还有元素可以遍历
         */
        while(it.hasNext(

      )){
            /**
             * E next()
             * 取出集合下一个可以遍历的元素
             */
            String str = (String)it.next();
            System.out.println(str);
            if("#".equals(str)){
                /**
                 * 在使用迭代器遍历集合元素的过程
                 * 中，不能通过集合的方法增删元素
                 * 否则会引发迭代器遍历集合的异常
                 */
//				c.remove(str);
                /**
                 * 迭代器的remove会删除通过next
                 * 方法取出的元素
                 */
                it.remove();
            }
        }

        System.out.println(c);
    }
}
