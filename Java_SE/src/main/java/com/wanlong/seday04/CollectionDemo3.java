package com.wanlong.seday04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  集合当中的泛型应用
 * 泛型用来规定集合中的元素类型
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> c
                = new ArrayList<String>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);

        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        for(String str : c){
            System.out.println(str);
        }

    }
}
