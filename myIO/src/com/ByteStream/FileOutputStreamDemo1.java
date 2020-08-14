/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 15:44
 */
package com.ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;
/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:\\Study\\Idea-Project\\Java-Restudy\\myIO\\src\\com\\test.txt");
 /*
            做了三件事情：
                A:调用系统功能创建了文件
                B:创建了字节输出流对象
                C:让字节输出流对象指向创建好的文件
         */
        fos.write(97);
        fos.write(57);
        fos.write(55);
        fos.close();
    }
}
