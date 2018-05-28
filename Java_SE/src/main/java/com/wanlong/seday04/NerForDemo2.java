package com.wanlong.seday04;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 使用新循环遍历集合
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class NerForDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        /**
         * 新循环并非新的语法，JVM并不认可新循环。
         * 新循环是编译器认可的，当编译器发现在
         * 使用新循环遍历集合时，会将代码改变为使
         * 用迭代器遍历。
         * 所以使用新循环遍历集合的过程中是不能通
         * 过集合的方法增删元素的。
         */
        for(Object o : c){
//		Iterator it = c.iterator();
//		while(it.hasNext()){
//			Object o = it.next();
            String str = (String)o;
            System.out.println(str);
            if("#".equals(str)){
                c.remove(str);//删除后，下次遍历会抛异常
            }
        }
    }
}
