package cn.ecut.dzy.old;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//深克隆的比较
public class Test1 {
    public static void main(String [] args){
        List<Employee> l=new ArrayList<Employee>();
        Employee e=new Employee("发给大家",345);
        long currentTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
           l.add(e.clone());
        }
        System.out.println("花费时间为："+(System.currentTimeMillis()-currentTime)+"毫秒");
        currentTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            ByteArrayOutputStream baos =new ByteArrayOutputStream();
            ObjectOutputStream out=null;
            try{
                out=new ObjectOutputStream(baos);
                out.writeObject(e);
            }catch (Exception e11){
                e11.printStackTrace();
            }
            ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream in=null;
            try{
                in=new ObjectInputStream(bais);
                l.add((Employee) in.readObject());
            }catch(Exception e3){
                e3.printStackTrace();
            }
        }
        System.out.println("花费时间为："+(System.currentTimeMillis()-currentTime)+"毫秒");
    }

}
