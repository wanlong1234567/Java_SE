package com.wanlong.seday05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * 遍历Map有三种方式：
 * 1:遍历所有的key
 * 2:遍历所有的键值对(Entry)
 * 3:遍历所有的value(相对不常用)
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class MapIterate {
    public static void main(String[] args) {
        Map<String,Integer> map
                = new HashMap<String,Integer>();
        map.put("语文", 99);
        map.put("数学", 98);
        map.put("英语", 97);
        map.put("理物", 96);
        map.put("化学", 99);
        System.out.println(map);

        /**
         * 遍历所有的key
         * Set<K> keySet()
         * 将当前Map中所有的key存入一个Set集合后
         * 返回。遍历该集合等同于遍历了Map中所有的
         * key。
         */
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("key:"+key);
        }

        /**
         * 获取每一组键值对
         * Set<Entry> entrySet()
         * Map将每一组键值对以一个Entry的实例
         * 保存。
         * Entry是Map的内部类，提供了两个
         * 常用的方法:getKey(),getValue()
         */
        Set<Map.Entry<String,Integer>> entrySet
                = map.entrySet();

        for(Map.Entry<String,Integer> e : entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }

        /**
         * 遍历所有的value
         *
         * Collection values()
         * 将当前Map中所有value存入一个集合后返回
         */
        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println("value:"+value);
        }
    }
}
