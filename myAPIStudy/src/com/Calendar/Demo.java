/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/11 11:00
 */
package com.Calendar;

import java.util.Calendar;

public class Demo {
        public static void main(String[] args) {
            Calendar c = Calendar.getInstance();

            c.add(Calendar.YEAR,10);

            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH)+1;
            int date = c.get(Calendar.DATE);

            System.out.println(year+"年"+month+"月"+date+"日");
        }
}
