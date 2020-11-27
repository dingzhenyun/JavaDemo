package day20190316.test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DingZhenYun
 * @create 2019-03-16 16:53
 */
//1.服务端读取图片并发送给客户端，客户端保存图片到本地
class Service3{
    public static void main(String[] args) {
        ServerSocket serverSocket= null;
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        InputStream is= null;
        try {
            serverSocket = new ServerSocket(9765);
            socket = serverSocket.accept();
            os = socket.getOutputStream();
            fis = new FileInputStream(new File("E:\\Demo\\socket\\src\\bg.jpg"));
            int len;
            byte [] b=new byte[1024];
            while((len=fis.read(b))!=-1){
                os.write(b,0,len);
            }
            socket.shutdownOutput();
            is = socket.getInputStream();
            int len1;
            byte [] b1=new byte[1024];
            while((len1=is.read(b1))!=-1){
                String str=new String(b1,0,len1);
                System.out.print(str);
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
            if(fis!=null){
                try {
                    fis.close();
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
            if(serverSocket!=null){
                try {
                    serverSocket.close();
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

class Clied3{
    public static void main(String[] args) {
        Socket socket= null;
        InputStream is= null;
        FileOutputStream fos= null;
        OutputStream os= null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9765);
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("E:\\Demo\\socket\\src\\222.jpg"));
            int len;
            byte [] b=new byte[1024];
            while((len=is.read(b))!=-1){
                fos.write(b,0,len);
            }
            os = socket.getOutputStream();
            os.write("已经下载好了".getBytes());
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
            if(fos!=null){
                try {
                    fos.close();
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
        }




    }
}

public class Test1 {
}
