/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 16:53
 */
package com.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("G:\\Study\\Idea-Project\\Java-Restudy\\1.jpg");

        FileOutputStream fos = new FileOutputStream("myIO\\1.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1) {
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
    }
}
