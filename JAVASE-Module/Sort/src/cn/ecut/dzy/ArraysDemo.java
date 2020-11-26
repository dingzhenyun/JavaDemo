package cn.ecut.dzy;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArraysDemo extends JFrame{
    public  void CreateJframe(){
        JFrame jf=new JFrame("获取一维数组最小值");
        JLabel jl=new JLabel("请在文本中输入数据：");
        JTextArea jt=new JTextArea(2,40);
        jf.setLayout(new FlowLayout());
        JButton jb=new JButton("计算");
        JLabel jl1=new JLabel("数组中最小的数是：");
        jf.add(jl);
        jf.add(jt);
        jf.add(jb);
        jf.add(jl1);
        jf.setVisible(true);
        //jf.setSize(400,250);
        jf.setBounds(200,200,600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=jt.getText().trim();
                if(text.equals("")){
                    JOptionPane.showMessageDialog(null,"你输入的信息为空");
                    return ;
                }
                for(int i=0;i<text.length();i++){
                    char a=text.charAt(i);
                    if(a!=' '&&!Character.isDigit(a)){
                        JOptionPane.showMessageDialog(null,"输入信息不合法");
                        jt.setText("");
                        return ;
                    }
                }
                String [] str=text.split(" {1,}");
                int [] array=new int [str.length];
                for(int i=0;i<array.length;i++){
                    array[i]=Integer.valueOf(str[i]);
                }
                int min=array[0];
                for(int i=1;i<array.length;i++){
                    if(min>array[i])
                        min=array[i];
                }
                jl1.setText("最小的数是："+min);
            }
        });
    }
    public static void main(String [] args){
        new ArraysDemo().CreateJframe();
    }
}
