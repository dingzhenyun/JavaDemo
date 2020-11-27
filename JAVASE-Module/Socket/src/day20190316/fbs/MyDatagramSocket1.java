package day20190316.fbs;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:01
 */
public class MyDatagramSocket1 extends DatagramSocket {
    static final int MAX_LEN=10;


    public MyDatagramSocket1(int port) throws SocketException {
        super(port);
    }
    public void sendMessage(InetAddress receiverHost,int receiverPort,String message)throws Exception{
        byte [] sendBuffer=message.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(sendBuffer,sendBuffer.length,receiverHost,MAX_LEN);
        this.send(datagramPacket);

    }
    public String receiveMessage() throws IOException {
        byte [] receiveBuffer=new byte[MAX_LEN];
        DatagramPacket datagramPacket=new DatagramPacket(receiveBuffer,MAX_LEN);
        this.receive(datagramPacket);
        String message=new String(receiveBuffer);
        return message;
    }
}
