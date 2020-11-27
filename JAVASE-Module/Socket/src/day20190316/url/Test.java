package day20190316.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author DingZhenYun
 * @create 2019-03-16 16:12
 * //URL:统一资源定位符，一个URL的对象，对应着互联网上一个资源。
 * //我们可以通过URL的对象调用其相应的方法，将此资源读取（“下载”）
 * /*
 * 		 *  public String getProtocol(  )     获取该URL的协议名
 * 			public String getHost(  )           获取该URL的主机名
 * 			public String getPort(  )            获取该URL的端口号
 * 			public String getPath(  )           获取该URL的文件路径
 * 			public String getFile(  )             获取该URL的文件名
 * 			public String getRef(  )             获取该URL在文件中的相对位置
 * 			public String getQuery(   )        获取该URL的查询名
 *
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.创建一个URL的对象
        URL url=new URL("http://localhost:8080/examples/a.txt");
        /*System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getRef());
        System.out.println(url.getQuery());*/
        //如何将服务端的资源读取进来:openStream()
        InputStream is=url.openStream();
        FileOutputStream fos1=new FileOutputStream(new File("E:\\Demo\\socket\\src\\1.txt"));
        byte [] b=new byte[20];
        int len;
        while((len=is.read(b))!=-1){
            String str=new String(b,0,len);
            System.out.println(str);
            fos1.write(b,0,len);
        }
        is.close();
        //如果既有数据的输入，又有数据的输出，则考虑使用URLConnection
        URLConnection urlConnection=url.openConnection();
        InputStream is1=urlConnection.getInputStream();
        FileOutputStream fos=new FileOutputStream(new File("E:\\Demo\\socket\\src\\abc.txt"));
        byte [] b1=new byte[20];
        int len1;
        while((len1=is1.read(b1))!=-1){
            fos.write(b1,0,len1);
        }
        fos.close();
        is1.close();
    }
}
