package com.wanlong.seday01;

/**
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("a");
        for(int i=0;i<10000000;i++){
            b.append("a");
        }
        System.out.println("完成!");
    }
}
