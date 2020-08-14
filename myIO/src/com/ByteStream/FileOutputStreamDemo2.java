/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 16:07
 */
package com.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:\\Study\\Idea-Project\\Java-Restudy\\myIO\\src\\com\\test.txt");

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);

        byte[] bys ={97,98,99,100,101,102};
        fos.write(bys);

        fos.close();
    }
}
