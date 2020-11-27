package day20190316.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author DingZhenYun
 * @create 2019-03-16 15:55
 */
//客户端给服务端发送文本，服务端会将文本转成大写在返回给客户端。
//如下程序为了保证相应的流及socket的关闭（即使在关闭之前出现异常，也一定要保证相应的资源的关闭），要求是用
//try-catch-finally进行操作。要求将关闭的信息写在finally里！
class Clied2{
    public static void main(String[] args) {
        Socket socket= null;
        OutputStream os= null;
        Scanner sc= null;
        InputStream is= null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9997);
            os = socket.getOutputStream();
            System.out.println("请输入多个字符：");
            sc = new Scanner(System.in);
            String str=sc.next();
            os.write(str.getBytes());
            socket.shutdownOutput();
            is = socket.getInputStream();
            byte [] b=new byte[10];
            int len;
            while((len=is.read(b))!=-1){
                String str1 = new String(b, 0, len);
                System.out.print(str1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(sc!=null){
                sc.close();
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Servie2{
    public static void main(String[] args) {
        ServerSocket serverSocket= null;
        Socket socket= null;
        InputStream is= null;
        OutputStream os= null;
        try {
            serverSocket = new ServerSocket(9997);
            socket = serverSocket.accept();
            is = socket.getInputStream();
            byte [] b=new byte[20];
            int len;
            String str=new String();
            while((len=is.read(b))!=-1){
                String string=new String(b,0,len);
                str+=string;
            }
            String strUpp=str.toUpperCase();
            os = socket.getOutputStream();
            os.write(strUpp.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }




    }
}

public class Test {
}
