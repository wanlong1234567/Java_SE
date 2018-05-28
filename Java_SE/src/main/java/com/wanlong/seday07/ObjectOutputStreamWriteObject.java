package com.wanlong.seday07;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * 对象流
 * 对象流是一对高级流，可以方便我们读写java中的
 * 任何对象。(对象与字节的转换工作由对象流完成)
 *
 * java.io.ObjectOutputStream
 * 对象输出流，用于写出java中的对象
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class ObjectOutputStreamWriteObject {
    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.setName("苍老师");
        p.setAge(18);
        p.setGender("女");

        List<String> otherInfo
                = new ArrayList<String>();
        otherInfo.add("是一名演员");
        otherInfo.add("爱好写大字");
        otherInfo.add("促进中日文化交流");
        otherInfo.add("广大男同胞的启蒙老师");
        p.setOtherInfo(otherInfo);

        System.out.println(p);

        FileOutputStream fos
                = new FileOutputStream("person.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("写出完毕!");

        oos.close();
    }
}
