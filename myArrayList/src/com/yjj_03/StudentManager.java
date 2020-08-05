/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/5 15:35
 */
package com.yjj_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统
 */
public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<Student>();
        //使用循环完成再次回到主界面
        while (true) {

            //使用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            //使用System.exit(0);来退出java虚拟机
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStuednt(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStuednt(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStuednt(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStuednt(array);
                    break;
                case "5":
                    System.out.println("感谢使用！");
                    System.exit(0);
            }
        }

    }

    //定义一个方法，添加学生信息
    public static void addStuednt(ArrayList<Student> array){
        //键盘录入学生对象所需要的数据,显示提示信息，提示要输入何种信息
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面被访问到，我们就把它定义在了循环外
        String sid;

        //为了让程序能够回到这里，我们使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }}

        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生的年龄：");
        String age = sc.nextLine();

        System.out.println("请输入学生的居住地：");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //如果与集合中的某一个学生学号相同，返回true;如果都不相同，返回false
        boolean flag = false;

        for(int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }


    //定义一个方法，查看学生信息
    public static void findAllStuednt(ArrayList<Student> array){

        //判断集合中是否有数据，如果没有显示提示信息
        //使用return，让程序不再往下执行
        if (array.size()==0){
            System.out.println("当前系统没有数据！");
            return;
        }
        //显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        //将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }


    }

    //定义一个方法，删除学生信息
    public static void deleteStuednt(ArrayList<Student> array){

        //键盘录入要删除的学生学号,显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();

        //在删除/修改学生操作前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除/修改操作
        //在外面定义index是为了能够在循环外面使用index
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
//                int index = i;
                index = i;
                break;
            }
        }
        //index=-1代表没被修改，即信息不存在
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功");
        }
    }

    //定义一个方法，修改学生信息
    public static void updateStuednt(ArrayList<Student> array){
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号：");
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应的学生信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        //给出修改成功提示
        System.out.println("修改学生成功");
    }

}

