/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/19 16:49
 */
package com.yjj_01;

/*
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();

        //void start​() 导致此线程开始执行; Java虚拟机调用此线程的run方法
        my1.start();
        my2.start();
    }
}

