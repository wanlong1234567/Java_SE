package com.wanlong.seday02;

/**
 * 包装类
 * java有8个基本类型，由于他们不是引用类型，不具有
 * 面向对象特性，所以不能直接参与面向对象的开发。
 * 为此java对着8个基本类型分别提供了对应的包装类
 * 来解决该问题
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class IntegerDemo {
    public static void main(String[] args) {
        /**
         * 基本类型转换为包装类时不建议采取new的
         * 形式，而应当使用包装类的静态方法:valueOf
         */
        Integer i1 = Integer.valueOf(128);
        Integer i2 = Integer.valueOf(128);

        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));


        int d = i1.intValue();
        System.out.println(d);


        Double dou = Double.valueOf(123.123);

        double dd = dou.doubleValue();
        System.out.println(dd);

    }
}
