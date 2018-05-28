package com.wanlong.seday05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * 可以通过集合的工具类java.util.Collections
 * 的静态方法sort进行。
 * 需要注意的是，只能对List排序，因为它有序。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionsSort {
    public static void main(String[] args) {
        List<Integer> list
                = new ArrayList<Integer>();

        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
