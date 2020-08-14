/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 10:59
 */
package com.File;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
            如果目录不存在，就创建目录，并返回true
            如果目录存在，就不创建目录，并返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
            自己补齐
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("G:\\Study\\File-Test\\java.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("G:\\Study\\File-Test\\TESE");
        System.out.println(f2.mkdir());

        File f3 = new File("G:\\Study\\File-Test\\TESE\\test.txt");
        System.out.println(f3.mkdirs());

        File f4 = new File("G:\\Study\\File-Test\\java\\test.txt");
        System.out.println(f4.createNewFile());

    }
}
