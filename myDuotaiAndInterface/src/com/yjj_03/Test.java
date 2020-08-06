/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/6 20:06
 */
package com.yjj_03;

public class Test {

    public static void main(String[] args) {

        BCoach bc1 = new BCoach();
        bc1.setName("bc1");
        bc1.setAge(10);
        System.out.println(bc1.getName()+","+bc1.getAge());
        bc1.eat();
        bc1.teach();

        PCoach pc1 = new PCoach("pc1",11);
        System.out.println(pc1.getName()+","+pc1.getAge());
        pc1.eat();
        pc1.teach();

        BPlayer bp1 = new BPlayer();
        bp1.setName("bp1");
        bp1.setAge(13);
        System.out.println(pc1.getName()+","+pc1.getAge());
        bp1.eat();
        bp1.study();

        PPlayer pp1 = new PPlayer("pp1",14);
        System.out.println(pp1.getName()+","+pp1.getAge());
        pp1.eat();
        pp1.study();




    }
}
