package day20190316.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DingZhenYun
 * @create 2019-03-22 20:39
 */
public class TcpThreand {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(9000);
        while (true){
            Socket socket= serverSocket.accept();
           new Thread(new Upload(socket)).start();
        }
    }
}
