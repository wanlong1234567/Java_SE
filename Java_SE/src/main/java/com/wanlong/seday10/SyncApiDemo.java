package com.wanlong.seday10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 使用集合工具类java.util.Collections的相关
 * 静态方法可以将现有的集合或Map转换为线程安全的
 *
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class SyncApiDemo {
    public static void main(String[] args) {
        /**
         * ArrayList和LinkedList都不是线程安全的
         */
        List<String> list
                = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);

        list = Collections.synchronizedList(list);
        for(String x:list){
            System.out.println("x:+++:"+x);
        }
        System.out.println(list);

        /**
         * HashSet不是线程安全的。
         */
        Set<String> set
                = new HashSet<String>(list);
        System.out.println(set);
        set = Collections.synchronizedSet(set);
        System.out.println(set);

        /**
         * HashMap不是线程安全的
         */
        Map<String,Integer> map
                = new HashMap<String,Integer>();
        map.put("语文", 98);
        map.put("数学", 97);
        map.put("英语", 94);
        System.out.println(map);
        map = Collections.synchronizedMap(map);
        System.out.println(map);

        /**
         * 哪怕是线程安全的集合也不与迭代器遍历
         * 该集合互斥，所以在开发时要自行维护互
         * 斥关系。
         */
    }
}
