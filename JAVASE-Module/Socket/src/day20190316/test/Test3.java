package day20190316.test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author DingZhenYun
 * @create 2019-03-22 16:52
 */
/*
 *  实现TCP图片上传客户端
 *  实现步骤:
 *    1. Socket套接字连接服务器
 *    2. 通过Socket获取字节输出流,写图片
 *    3. 使用自己的流对象,读取图片数据源
 *         FileInputStream
 *    4. 读取图片,使用字节输出流,将图片写到服务器
 *       采用字节数组进行缓冲
 *    5. 通过Socket套接字获取字节输入流
 *       读取服务器发回来的上传成功
 *    6. 关闭资源
 */
class Clied4{
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream outputStream=null;
        FileInputStream fileInputStream=null;
        try {
           socket=new Socket(InetAddress.getByName("127.0.0.1"),9000);
           outputStream=socket.getOutputStream();
            fileInputStream=new FileInputStream("E:\\Demo\\socket\\src\\bg1.jpg");
            int len=0;
            byte [] bytes=new byte[1024];
            while ((len=fileInputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
            socket.shutdownOutput();
            //获取字节输入流,读取服务器的上传成功
            InputStream is=socket.getInputStream();
            int len1;
            byte [] bb=new byte[1024];
            while((len1=is.read(bb))!=-1){
                String s=new String(bb,0,len1);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream!=null){
                try {
                    outputStream.close();
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

/*
        *  TCP图片上传服务器
        *   1. ServerSocket套接字对象,监听端口8000
        *   2. 方法accept()获取客户端的连接对象
        *   3. 客户端连接对象获取字节输入流,读取客户端发送图片
        *   4. 创建File对象,绑定上传文件夹
        *       判断文件夹存在, 不存,在创建文件夹
        *   5. 创建字节输出流,数据目的File对象所在文件夹
        *   6. 字节流读取图片,字节流将图片写入到目的文件夹中
        *   7. 将上传成功会写客户端
        *   8. 关闭资源
        *
        */
class Service4{
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream is=null;
        try {
             serverSocket=new ServerSocket(9000);
            socket=serverSocket.accept();
             is=socket.getInputStream();
            File file=new File("d:/upload1");
            if(!file.exists()){
                file.mkdir();
            }
            //防止文件同名被覆盖,从新定义文件名字
            //规则:  域名+毫秒值+6位随机数
            String filename=System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
            FileOutputStream fos=new FileOutputStream(file+File.separator+filename);
            byte [] bytes=new byte[1024];
            int len=0;
            while((len=is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            socket.getOutputStream().write("上传成功".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

public class Test3 {
}
