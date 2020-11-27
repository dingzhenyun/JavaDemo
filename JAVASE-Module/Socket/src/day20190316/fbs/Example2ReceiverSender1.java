package day20190316.fbs;

        import java.net.InetAddress;

/**
 * @author DingZhenYun
 * @create 2019-03-27 9:02
 */
public class Example2ReceiverSender1 {
    public static void main(String[] args) {
        if(args.length!=4){
            System.out.println("no four arguments");
        }else {
            try {
                InetAddress receiverHost = InetAddress.getByName(args[0]);
                int receiverProt = Integer.parseInt(args[1]);
                int myPort = Integer.parseInt(args[2]);
                String message = args[3];
                MyDatagramSocket myDatagramSocket = new MyDatagramSocket(myPort);
                System.out.println(myDatagramSocket.receiveMessage());
                myDatagramSocket.sendMessage(receiverHost,receiverProt,message);
                myDatagramSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
