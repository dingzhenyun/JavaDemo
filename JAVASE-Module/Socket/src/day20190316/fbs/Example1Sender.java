package day20190316.fbs;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:01
 */
//发送端
public class Example1Sender {
    public static void main(String[] args) {
        DatagramSocket datagramSocket=null;
        try {
             datagramSocket=new DatagramSocket();
            String message="你好，服务端，我是客服端！么么哒。你好，服务端，我是客服端。你好，服务端，我是客服端。你好，服务端，我是客服端。你好，服务端，我是客服端";
            byte [] buffer=message.getBytes();
            DatagramPacket datagramPacket=new DatagramPacket(buffer,0,buffer.length, InetAddress.getByName("127.0.0.1"), 9001);
            datagramSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(datagramSocket!=null){
                datagramSocket.close();
            }
        }
    }
}
