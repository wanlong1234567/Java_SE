package com.wanlong.seday04;
import java.util.ArrayList;
import java.util.List;
/**
 * 获取List子集
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class ListSubList {
    public static void main(String[] args) {
        List<Integer> list
                = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        /**
         * 含头不含尾
         * [3,4,5,6,7]
         */
        List<Integer> subList
                = list.subList(3, 8);
        System.out.println(subList);

        //将子集元素扩大10倍
        for(int i=0;i<subList.size();i++){
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);
        /**
         * 对子集的元素操作就是对原集合对应元素
         * 的操作。
         */
        System.out.println(list);

        list.subList(2, 9).clear();
        System.out.println(list);
    }
}
