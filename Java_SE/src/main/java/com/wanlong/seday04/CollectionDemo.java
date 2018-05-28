package com.wanlong.seday04;

import com.wanlong.seday02.Point;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只存放引用类型的元素
 * 并且集合存放的是元素的引用(地址)
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1,2);
        c.add(p);
        System.out.println("p:"+p);//p:(1,2)
        System.out.println("c:"+c);//c:[(1,2)]

        p.setX(2);
        System.out.println("p:"+p);//p:(2,2)
        System.out.println("c:"+c);//c:[(2,2)]
    }
}
