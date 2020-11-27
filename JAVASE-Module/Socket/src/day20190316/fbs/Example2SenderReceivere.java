package day20190316.fbs;

import java.net.InetAddress;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:02
 */
public class Example2SenderReceivere {
    public static void main(String[] args) {
        try {
            MyDatagramSocket myDatagramSocket=new MyDatagramSocket(9945);
            String message="你好啊,我是客服端，我是客服端，我是客服端";
            myDatagramSocket.sendMessage(InetAddress.getByName("127.0.0.1"),9944,message);
            System.out.println(myDatagramSocket.receiveMessage());
            myDatagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
