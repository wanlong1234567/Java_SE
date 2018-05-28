package com.wanlong.seday08;

import java.awt.*;
import java.io.IOException;

/**
 * 子类重写父类含有throws声明异常抛出的方法时
 * 的规则
 * @author wanlong
 * Date:2018/5/27
 * @since JDK1.8
 * @version 1.0
 */
public class Exception_throws {
    public void dosome()
            throws IOException,AWTException {

    }
}

class Son extends Exception_throws{
//	public void dosome()
//			throws IOException,AWTException{
//	}

    //允许不再抛出任何异常
//	public void dosome(){
//
//	}

    //仅抛出部分异常
//	public void dosome()
//			throws IOException{
//
//	}

    //抛出父类方法抛出异常的子类型异常
//	public void dosome()
//			throws FileNotFoundException{
//
//	}

    //不可以抛出额外异常
//	public void dosome()
//			throws SQLException{
//
//	}

    //不能抛出父类方法抛出异常的父类型异常
//	public void dosome()
//			throws Exception{
//
//	}

}
