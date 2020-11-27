package day20190316.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author DingZhenYun
 * @create 2019-03-16 13:
 *
 *  * 网络通信的第一个要素：IP地址。通过IP地址，唯一的定位互联网上一台主机
 *  * InetAddress:位于java.net包下
 *  * 1.InetAddress用来代表IP地址。一个InetAdress的对象就代表着一个IP地址
 *  * 2.如何创建InetAddress的对象：getByName(String host)
 *  * 3.getHostName(): 获取IP地址对应的域名
 *  *   getHostAddress():获取IP地址
 *
 */
public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        //创建一个InetAddress对象：getByName()
        InetAddress inet=InetAddress.getByName("www.baidu.com");
        System.out.println(inet);
        System.out.println(inet.getHostName());
        System.out.println(inet.getHostAddress());
        //本机
        InetAddress inet1=InetAddress.getLocalHost();
        System.out.println(inet1);
        System.out.println(inet1.getHostName());
        System.out.println(inet.getHostAddress());
    }
}
