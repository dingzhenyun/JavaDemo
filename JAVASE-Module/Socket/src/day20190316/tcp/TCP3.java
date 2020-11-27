package day20190316.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author DingZhenYun
 * @create 2019-03-16 14:33
 * 从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 */
class Cliek1{
    public static void main(String[] args) {
        Socket socket= null;
        OutputStream os= null;
        FileInputStream fis= null;
        InputStream is= null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9990);
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
            while((len1=is.read(b))!=-1){
                String str=new String(b1,0,len1);
                System.out.println(str);
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

class Service1{
    public static void main(String[] args) {
        ServerSocket serverSocket= null;
        Socket socket= null;
        InputStream is= null;
        FileOutputStream fos= null;
        OutputStream os= null;
        try {
            serverSocket = new ServerSocket(9990);
            socket = serverSocket.accept();
            is = socket.getInputStream();
            fos = new FileOutputStream(new File("E:\\Demo\\socket\\src\\bg1.jpg"));
            int len;
            byte [] b=new byte[1024];
            while((len=is.read(b))!=-1){
                fos.write(b,0,len);
            }
            System.out.println("收到来自于"+socket.getInetAddress().getHostAddress()+"的文件");
            os = socket.getOutputStream();
            os.write("已经收到你的图片".getBytes());
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

public class TCP3 {
}
