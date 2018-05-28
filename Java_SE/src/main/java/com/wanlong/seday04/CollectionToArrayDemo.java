package com.wanlong.seday04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 *
 * Collection中提供了将当前集合转换为一个数组
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c
                = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");

//		Object[] array = c.toArray();

        String[] array
                = c.toArray(new String[c.size()]);
        System.out.println(array.length);
        for(String str : array){
            System.out.println(str);
        }

    }
}
