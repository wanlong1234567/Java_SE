package com.wanlong.seday08;

/**
 * 异常捕获机制中的try-catch
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Exception_try_catch {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try{
            String str = "a";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            /**
             * try语句块中出错代码以下的所有代码
             * 都不再运行。
             */
            System.out.println("!!!!");

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("出现了字符串下标越界!");
        }catch(NullPointerException e){
            System.out.println("出现了空指针!");
            /**
             * catch可以定义多个，针对try代码块中可能
             * 出现的异常有不同处理方式时，需要单独捕获
             * 这些异常并编写解决手段的代码。
             * 但是应当养成一个习惯，就是在最后捕获
             * Exception,这样会避免因抛出一个未捕获的
             * 异常导致程序可能出现中断的情况。
             * 当捕获的异常之间存在继承关系时，需要将
             * 子类异常定义在上面先捕获，后定义父类型
             * 异常.
             *
             */
        }catch(Exception e){
            System.out.println("反正就是出了个错!");
        }

        System.out.println("程序结束了");
    }
}
