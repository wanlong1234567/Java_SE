package com.wanlong.seday07;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * java.io.ObjectInputStream
 * 对象输入流
 * 用于将一组字节(通过对象输出流写出对象而转换的
 * 一组字节)读取并转换为对应的对象。
 *
 * 对象输出流将对象写出时转换为一组字节的过程
 * 称为:对象序列化
 * 对象输入流将这组字节读取并还原回对象的过程
 * 称为:对象反序列化
 *
 *
 *
 * @author wanlong
 * Date:2018/5/26
 * @since JDK1.8
 * @version 1.0
 */
public class ObjectInputStreamReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis
                = new FileInputStream("person.obj");

        ObjectInputStream ois
                = new ObjectInputStream(fis);

        Person p = (Person)ois.readObject();
        System.out.println(p);

        ois.close();
    }
}
