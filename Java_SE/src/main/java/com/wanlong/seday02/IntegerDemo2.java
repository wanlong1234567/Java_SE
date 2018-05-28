package com.wanlong.seday02;

/**
 * 数字类型的包装类提供了两个常量:
 * MAX_VALUE,MIN_VALUE
 * 分别表示对应的基本类型的取值范围
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);

        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
    }
}
