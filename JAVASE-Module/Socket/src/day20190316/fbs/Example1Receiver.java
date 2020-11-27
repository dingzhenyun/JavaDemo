package day20190316.fbs;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:01
 */
public class Example1Receiver {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket=new DatagramSocket(9001);
            byte [] bytes=new byte[100];
            DatagramPacket datagramPacket=new DatagramPacket(bytes,0,bytes.length);
            for(int i=0;i<10;i++){
                datagramSocket.receive(datagramPacket);
                String message=new String(datagramPacket.getData(),0,bytes.length);
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
