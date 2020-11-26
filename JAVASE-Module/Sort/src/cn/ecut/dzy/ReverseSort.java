package cn.ecut.dzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class ReverseSort extends JFrame{
    private JFrame f;
    private JLabel l;
    private JTextArea T1;
    private JTextArea T2;
    private JButton B1;

    public ReverseSort(){
        f=new JFrame("反转排序：");
        l=new JLabel("输入数组内容:");
        T1=new JTextArea(1,20);
        T2=new JTextArea(10,20);
        B1 =new JButton("排序");
        f.setLayout(new FlowLayout());
        f.add(l);
        f.add(T1);
        f.add(B1);
        f.add(T2);
        f.setBounds(300,300,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init1();
    }
    public void init1(){
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=T1.getText();
                if("".equals(text)){
                    JOptionPane.showMessageDialog(null,"输入信息不合法");
                    return ;
                }
                String [] str=text.split(" {1,}");
                T2.setText("");
                T2.setText("原数据：\n");
                // System.out.println("原数据：");
                for(String s:str){
                    T2.append(s+" ");
                }
                T2.append("\n");
                T2.append("排序后\n");
                for(int i=0;i<=str.length/2;i++){
                    String temp=str[i];
                    str[i]=str[str.length-i-1];
                    str[str.length-i-1]=temp;

                }
                for(String s:str){
                    T2.append(s+" ");
                }
            }
        });
        T1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
//                super.keyPressed(e);
                char c=e.getKeyChar();
                String mask="0123456789"+(char)8;
                if(mask.indexOf(c)==-1){
                    e.consume();

                }
            }
        });
    }
    public static void main(String [] args){
        new ReverseSort();
    }


}
