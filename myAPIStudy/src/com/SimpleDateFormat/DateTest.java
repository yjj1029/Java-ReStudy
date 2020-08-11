/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/10 12:37
 */
package com.SimpleDateFormat;

import java.text.ParseException;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s1 = DateUtils.dateToString(d,"yyyy-MM-dd HH:mm:ss");

        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy MM dd");

        System.out.println(s2);
        System.out.println("--------");

        String s = "2020-08-10 12:42:26";

        Date d1 = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");

        System.out.println(d1);
    }
}
