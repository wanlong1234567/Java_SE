package com.wanlong.seday05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定义类型元素
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionsSort3 {
    public static void main(String[] args) {
        List<Point> list
                = new ArrayList<Point>();

        list.add(new Point(5,6));
        list.add(new Point(3,2));
        list.add(new Point(1,7));
        list.add(new Point(8,2));
        list.add(new Point(9,4));
        System.out.println(list);
        /**
         * 对对象不能进行转换为数组
         */

//        String[] array=list.toArray(new String[list.size()]);
//        System.out.println("length:"+array.length);
//        for(String s:array){
//            System.out.println("jjjjj:"+s);
//        }
        /**
         * sort方法要求集合元素必须实现
         * Comparable接口。否则无法对该
         * 集合排序。
         */
        Collections.sort(list);
        System.out.println(list);
        System.out.println("sssss:"+list.get(0).getX());

    }
}
