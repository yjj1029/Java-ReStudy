/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/17 14:54
 */
package com.ByteStream;


import java.io.*;

/*
    需求：
        把E:\\itcast\\字节流复制图片.avi 复制到模块目录下的 字节流复制图片.avi

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1:基本字节流一次读写一个字节             共耗时：64565毫秒
        2:基本字节流一次读写一个字节数组          共耗时：107毫秒
        3:字节缓冲流一次读写一个字节             共耗时：405毫秒
        4:字节缓冲流一次读写一个字节数组          共耗时：60毫秒
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        method4();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }


    //基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\下载区\\视频\\倩倩 11\\9.29s黑母.mp4");
        FileOutputStream fos = new FileOutputStream("G:\\下载区\\视频\\test\\29s黑母.mp4");

        int by;
        while ((by=fis.read())!=-1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("G:\\下载区\\视频\\倩倩 11\\9.29s黑母.mp4");
        FileOutputStream fos = new FileOutputStream("G:\\下载区\\视频\\test\\29s黑母.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fos.close();
        fis.close();
    }

    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\下载区\\视频\\倩倩 11\\9.29s黑母.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\下载区\\视频\\test\\29s黑母.mp4"));


        int by;
        while ((by=bis.read())!=-1) {
            bos.write(by);
        }

        bos.close();
        bos.close();
    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\下载区\\视频\\倩倩 11\\9.29s黑母.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\下载区\\视频\\test\\29s黑母.mp4"));


        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bos.close();
        bis.close();
    }

}
