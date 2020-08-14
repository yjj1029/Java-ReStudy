/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 11:25
 */
package com.File;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
//        File f = new File("G:\\Study\\File-Test\\java.txt");
        File f1 = new File("myFile\\java.txt");
//        System.out.println(f1.createNewFile());
//        System.out.println("--------");


            File f3 = new File("myIO\\javaTest");
            System.out.println(f3.mkdir());
            File f4 = new File("myIO\\javaTest\\java.txt");
            System.out.println(f4.createNewFile());


    }
}
