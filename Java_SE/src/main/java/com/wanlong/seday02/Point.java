package com.wanlong.seday02;

/**
 * 使用Point测试Object相关方法重写规则
 * Point设计用于表示直角坐标系上的一个点
 *
 * @author wanlong
 * Date:2018/5/25
 * @since JDK1.8
 * @version 1.0
 */
public class Point {
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
    /**
     * 重写toString方法的原则：
     * toString返回的字符串应当包含当前对象的
     * 内容信息(属性的值)。具体格式和内容根据
     * 当前类实际设计需求而定。
     *
     */
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    /**
     * 重写Object提供的equals方法
     * equals方法的设计目的是比较两个对象的内容
     * 是否一致。
     * 比较原则:
     * 将两个对象的属性值进行比较，不一定要求所有
     * 属性值都相同，具体根据当前类的设计需求而定
     *
     */
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(obj instanceof Point){
            Point p = (Point)obj;
            return this.x==p.x&&this.y==p.y;
        }
        return false;
    }
}
