package com.wanlong.seday04;

/**
 * 泛型是编译器认可
 * 泛型的实际类型是Object，在使用的时候编译器会
 * 进行检查或自动造型。
 * 当对泛型变量赋值时，编译器检查是否符合类型要求
 * 获取泛型值时，编译器会补充自动造型的代码。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class TestPoint2 {
    public static void main(String[] args) {
        Point<Integer> p1
                = new Point<Integer>(1,2);

        System.out.println("p1:"+p1);
        p1.setX(2);
        System.out.println("p1:"+p1);
        int x1 = p1.getX();
        System.out.println("x1:"+x1);
        //泛型不指定则是原型Object public static void main(String[] args) {
        //		Point<Integer> p1
        //			= new Point<Integer>(1,2);
        //		System.out.println("p1:"+p1);
        //		p1.setX(2);
        //		System.out.println("p1:"+p1);
        //		int x1 = p1.getX();
        //		System.out.println("x1:"+x1);
        //		//泛型不指定则是原型Object
        //		Point p2 = p1;
        //		System.out.println("p2:"+p2);public static void main(String[] args) {
        //		Point<Integer> p1
        //			= new Point<Integer>(1,2);
        //		System.out.println("p1:"+p1);
        //		p1.setX(2);
        //		System.out.println("p1:"+p1);
        //		int x1 = p1.getX();
        //		System.out.println("x1:"+x1);
        //		//泛型不指定则是原型Object
        //		Point p2 = p1;
        //		System.out.println("p2:"+p2);
        //		p2.setX("二");
        //		System.out.println("p2:"+p2);
        //
        //		x1 = p1.getX();//报错!
        //		System.out.println("x1:"+x1);//?
        //	}
        //		p2.setX("二");
        //		System.out.println("p2:"+p2);
        //
        //		x1 = p1.getX();//报错!
        //		System.out.println("x1:"+x1);//?
        //	}
        Point p2 = p1;
        System.out.println("p2:"+p2);
        p2.setX("二");
        System.out.println("p2:"+p2);

        x1 = p1.getX();//报错!
        System.out.println("x1:"+x1);//?
    }
}
