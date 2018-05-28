package com.wanlong.seday05;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map 查找表
 * 以key-value对的形式存放元素。所以看起来像是
 * 一个多行两列的表格。
 *
 * Map要求key不允许重复(equals比较为true)。
 * 常用实现类:
 * java.util.HashMap
 * 散列表，使用散列算法实现的Map
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class MapPutGet {
    public static void main(String[] args) {
        Map<String,Integer> map
                = new HashMap<String,Integer>();
        /**
         * V put(k k ,V v)
         * 将给定的key-value对存入到Map中
         * 若给定的key在Map中已经存在，由于Map要求
         * key不允许重复，所以这时为替换value操作
         * 返回值为这个key原来对应的value值。
         * 若key在Map中不存在，则返回值为null
         */
        map.put("语文", 99);
        map.put("数学", 98);
        map.put("英语", 97);
        map.put("物理", 96);
        map.put("化学", 99);

        System.out.println(map);
        //使用相同的key是替换value操作
        Integer num = map.put("数学", 95);
        System.out.println(map);
        System.out.println("被替换值:"+num);


        /**
         * V get(K k)
         * 根据给定的key获取对应的value，若
         * 给定的key在当前Map中不存在，则返回
         * 值为null
         */
        num = map.get("语文");
        System.out.println("语文:"+num);

    }
}
