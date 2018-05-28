package com.wanlong.seday05;

/**
 * 影响散列表查询性能的一个因素是:产生链表
 * 而链表产生的一个主要因素是:
 * 做为key的元素hashcode值一样，而equals比较
 * 不为true。
 * hashcode值一样时，在Map内部数组的位置相同，但是
 * 若key不相同，那么就会在该位置产生一个链表。遍历
 * 链表检索数据会降低HashMap检索性能。所以要避免。
 *
 * 因此在API文档中也有说明对equals与hashcode的
 * 重写要求:
 * 1:成对重写，即：当重写一个类的equals方法时，就
 *   应当连同重写hashcode方法
 * 2:一致性,即:当两个对象equals比较为true时，
 *   hashcode方法返回的数字应当相等。反之，两个
 *   对象hashcode相等，equals比较应当为true。
 *   否则会在HashMap中产生链表，影响查询性能。
 * 3:稳定性,即:当一个对象参与equals比较的属性的
 *   值没有发生改变的前提下，多次调用hashcode
 *   返回的数字应当不变。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class Key {
    private int x;
    private int y;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Key other = (Key) obj;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        return true;
    }
}
