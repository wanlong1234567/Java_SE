package com.wanlong.seday05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 排序字符串
 *
 * @author wanlong
 *Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionsSort2 {
    public static void main(String[] args) {
        List<String> list
                = new ArrayList<String>();

        list.add("苍老师");
        list.add("范老师");
        list.add("小泽老师");

        System.out.println(list);
        /**
         * 字符串排序是按照字符串字符的编码顺序
         * 排序的。
         */
        Collections.sort(list);
        System.out.println(list);
    }
}
