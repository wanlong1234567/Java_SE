package com.wanlong.seday04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合的集合操作
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c");
        c1.add(".net");
        System.out.println("c1:"+c1);

        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);

        /**
         * boolean addAll(Collection c)
         * 将给定的集合中的元素存入到当前集合中
         * 当前集合元素发生了变化则返回true
         */
        c2.addAll(c1);
        System.out.println("c2:"+c2);

        Collection c3 = new ArrayList();
        c3.add("c");
        c3.add("ios");
//		c3.add("php");
        System.out.println("c3:"+c3);
        /**
         * boolean containsAll(Collection c)
         * 判断当前集合是否包含给定集合中的所有元素
         */
        boolean containsAll = c2.containsAll(c3);
        System.out.println("c2包含c3所有元素:"+containsAll);


        /**
         * boolean removeAll(Collection c)
         * 删除当前集合中与给定集合的相同元素
         */
        c2.removeAll(c3);
        System.out.println("c2:"+c2);
    }
}
