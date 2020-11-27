package day20190316.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DingZhenYun
 * @create 2019-03-16 14:08
 */
//TCP编程例二：客户端给服务端发送信息，服务端将信息打印到控制台上，同时发送“已收到信息”给客户端
class Service{
    public static void main(String[] args) {
        ServerSocket ss= null;
        Socket socket= null;
        InputStream is= null;
        OutputStream os= null;
        try {
            ss = new ServerSocket(9999);
            socket = ss.accept();
            is = socket.getInputStream();
            int len=0;
            byte [] b=new byte[20];
            while((len=is.read(b))!=-1){
                String string=new String(b,0,len);
                System.out.print(string);
            }
            os = socket.getOutputStream();
            os.write("收到".getBytes());
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
            if(ss!=null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}

class Click{
    public static void main(String[] args) {
        Socket socket= null;
        OutputStream os= null;
        InputStream is= null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
            os = socket.getOutputStream();
            os.write("我是客服端".getBytes());
            //shutdownOutput():执行此方法，显式的告诉服务端发送完毕！
            socket.shutdownOutput();
            is = socket.getInputStream();
            int len=0;
            byte [] b=new byte[20];
            while((len=is.read(b))!=-1){
                String string=new String(b,0,len);
                System.out.print(string);
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

public class TCP2 {
}
