/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/14 15:29
 */
package com.DiGui;

import java.io.File;

/*
    需求：
        需求：给定一个路径(E:\\itcast)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台

    思路：
        1:根据给定的路径创建一个File对象
        2:定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
        3:获取给定的File目录下所有的文件或者目录的File数组
        4:遍历该File数组，得到每一个File对象
        5:判断该File对象是否是目录
            是：递归调用
            不是：获取绝对路径输出在控制台
        6:调用方法
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        File srcFile = new File("G:\\Study\\Idea-Project\\Java-Restudy\\myIO");
        getAllFilePath(srcFile);
    }
    public static void getAllFilePath(File srcFile){
        File[] fileArray =srcFile.listFiles();
        if (fileArray != null){
            for (File f : fileArray){
                if (f.isDirectory()){
                    getAllFilePath(f);
                } else{
                    String abp = f.getAbsolutePath();
                    System.out.println(abp);
                }
            }
        }


    }
}
