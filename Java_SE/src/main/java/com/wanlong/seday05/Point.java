package com.wanlong.seday05;

/**
 * 使用该类测试作为集合元素对自定义元素的排序
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    /**
     * 实现Comparable接口后需要重写方法compareTo
     * 该方法是用来定义当前对象(this)与参数对象(o)
     * 之间的大小关系。
     * 返回值不关注具体取值，只关注取值范围:
     * 当返回值大于0:当前对象大于参数对象(this大于0)
     * 当返回值小于0:当前对象小于参数对象
     * 当返回值等于0:两个对象相等
     */
    @Override
    public int compareTo(Point o) {
        /*
         * 点到原点距离才长的大
         */
        int len = this.x*this.x+this.y*this.y;
        int olen = o.x*o.x+o.y*o.y;
        return len-olen;
    }
}
