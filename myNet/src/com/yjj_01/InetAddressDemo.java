/**
 * @作者 鄢加军
 * @我的学习 $ https://github.com/yjj1029/Java-ReStudy
 * @想说的话 靠自己才能成功，自律才会成功！！！
 * @创建时间 2020/8/27 14:38
 */
package com.yjj_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-PB9J65F");

        String name = address.getHostName();
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);//DESKTOP-PB9J65F
        System.out.println("IP地址：" + ip);//192.168.50.99
    }
}
