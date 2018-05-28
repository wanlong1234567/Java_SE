package com.wanlong.seday04;
import java.util.ArrayList;
import java.util.List;
/**
 * java.util.List
 * List是Collection的子类型接口。
 * List是可重复集，并且有序，提供了一套可以根据
 * 下标操作元素的方法。
 *
 * 常用实现类:
 * java.util.ArrayList:数组实现，查询效率高
 * java.util.LinkedList:链表实现，增删元素效率高
 * 尤其是首尾增删元素。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class ListGetSet {
    public static void main(String[] args) {
        List<String> list
                = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);

        /**
         * E get(int index)
         * 将指定下标所对应的元素返回
         */
        //获取第二个元素
        String str = list.get(1);
        System.out.println(str);

        for(int i=0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }


        /**
         * E set(int index,E e)
         * 将给定元素替换集合中指定位置的元素
         * 并将被替换元素返回。
         */
        String old = list.set(1, "2");
        System.out.println(list);
        System.out.println("被替换的元素:"+old);
    }
}
