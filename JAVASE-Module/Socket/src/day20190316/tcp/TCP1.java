package day20190316.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DingZhenYun
 * @create 2019-03-16 13:51
 */
//TCP编程例一：客户端给服务端发送信息。服务端输出此信息到控制台上
//网络编程实际上就是Socket的编程
class C{
    public static void main(String[] args) {
        // 客户端
        Socket s= null;
        OutputStream outputStream = null;
        try {
            // 1.创建一个Socket的对象，通过构造器指明服务端的IP地址，以及其接收程序的端口号
            s = new Socket(InetAddress.getByName("127.0.0.1"),8889);
            // 2.getOutputStream()：发送数据，方法返回OutputStream的对象
            outputStream = s.getOutputStream();
            // 3.具体的输出过程
            outputStream.write("我是客户端，请多关照".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 4.关闭相应的流和Socket对象
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(s!=null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class S{
    public static void main(String[] args) {
        //服务端
        ServerSocket ss= null;
        Socket s= null;
        InputStream inputStream = null;
        try {
            // 1.创建一个ServerSocket的对象，通过构造器指明自身的端口号
            ss = new ServerSocket(8889);
            // 2.调用其accept()方法，返回一个Socket的对象
            s = ss.accept();
            // 3.调用Socket对象的getInputStream()获取一个从客户端发送过来的输入流
            inputStream = s.getInputStream();
            int len;
            byte [] b=new byte[20];
            // 4.对获取的输入流进行的操作
            while((len=inputStream.read(b))!=-1){
                String str=new String(b,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 5.关闭相应的流以及Socket、ServerSocket的对象
            try {
                if(inputStream!=null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(s!=null){
                try {
                    s.close();
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

public class TCP1 {

}
