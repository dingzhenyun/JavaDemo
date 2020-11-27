package day20190316.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author DingZhenYun
 * @create 2019-03-16 15:28
 */
class Send {
    public static void main(String[] args) {
        //发送端
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
            byte[] b = "你好，服务端，我是客服端！么么哒。你好，服务端，我是客服端。你好，服务端，我是客服端。你好，服务端，我是客服端。你好，服务端，我是客服端\"".getBytes();
            //创建一个数据报：每一个数据报不能大于64k，都记录着数据信息，发送端的IP、端口号,以及要发送到
            //的接收端的IP、端口号。
            DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getByName("127.0.0.1"), 9090);
            ds.send(dp);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(ds!=null){
                try {
                    ds.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Re{

    public static void main(String[] args) {
        //接受端
        DatagramSocket ds= null;
        try {
            ds = new DatagramSocket(9090);
            byte [] b=new byte[1024];
            DatagramPacket dp=new DatagramPacket(b,0,b.length);
            ds.receive(dp);
            String str=new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ds!=null){
                ds.close();
            }
        }

    }
}

public class TestUDP {
}
