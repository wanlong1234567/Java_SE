package com.wanlong.seday04;

/**
 * 泛型  JDK1.5之后推出的一个特性。
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class Point<E> {
    private E x;
    private E y;

    public Point(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public void setX(E x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
