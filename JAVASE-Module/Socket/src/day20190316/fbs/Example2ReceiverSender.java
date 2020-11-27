package day20190316.fbs;

        import java.net.InetAddress;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:02
 */
public class Example2ReceiverSender {
    public static void main(String[] args) {
        try {
            MyDatagramSocket myDatagramSocket=new MyDatagramSocket(9945);
            System.out.println(myDatagramSocket.receiveMessage());
            myDatagramSocket.sendMessage(InetAddress.getByName("127.0.0.1"),9942,"收到");
            myDatagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
