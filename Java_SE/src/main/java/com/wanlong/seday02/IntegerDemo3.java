package com.wanlong.seday02;

/**
 * JDK1.5之后推出了一个新的特性:
 * 自动拆装箱
 * 该特性是编译器认可，而非虚拟机。该特性是编译器
 * 在编译源代码时自动补充了基本类型与包装类之间的
 * 转换代码。从而使程序员不用在为两者之间互转而
 * 编写转换代码。
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class IntegerDemo3 {
    public static void main(String[] args) {
        /**
         * 自动拆箱
         * 编译器会补充代码到class文件中:
         * int d = new Integer(123).intValue();
         */
        int d = new Integer(123);
        /**
         * 自动装箱
         * 编译器会补充代码到class文件中:
         * Integer in = Integer.valueOf(d);
         */
        Integer in = d;
    }
}
