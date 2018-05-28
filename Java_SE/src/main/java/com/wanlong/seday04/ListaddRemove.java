package com.wanlong.seday04;
import java.util.ArrayList;
import java.util.List;
/**
 * List提供了一对重载的add,remove方法
 * 也可以通过下标操作元素
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class ListaddRemove {
    public static void main(String[] args) {
        List<String> list
                = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        /**
         * [one,2,two,three,four]
         */
        list.add(1, "2");
        System.out.println(list);

        /**
         * [one,2,three,four]
         */
        String old = list.remove(2);
        System.out.println(list);
        System.out.println("被删除元素:"+old);

    }
}
