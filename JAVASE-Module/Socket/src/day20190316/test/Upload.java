package day20190316.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Random;

/**
 * @author DingZhenYun
 * @create 2019-03-22 17:19
 */
public class Upload implements Runnable{
    private Socket socket=null;
    public Upload(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream is=socket.getInputStream();
            File file=new File("D:/upload1");
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
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
