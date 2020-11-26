package cn.ecut.dzy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SelectSort extends JFrame {
    private JFrame f;
    private JTextArea T1;
    private JTextArea T2;
    private JButton B1;
    private JButton B2;
    private int [] arr=new int[10];
    public SelectSort(){
        f=new JFrame("选择排序：");
        T1=new JTextArea(3,40);
        T2=new JTextArea(3,40);
        B1 =new JButton("生成随机数");
        B2 =new JButton("选择排序");
        f.setLayout(new FlowLayout());
        f.add(T1);
        f.add(B1);
        f.add(T2);
        f.add(B2);
        f.setBounds(300,300,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
    }

    private void init() {
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                T1.setText("");
                Random r=new Random();
                for(int i=0;i<arr.length;i++){
                     arr[i]=r.nextInt(50)+1;
                    T1.append(arr[i]+" ");
                }
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                T2.setText("");
                int index=0;
                for(int i=0;i<arr.length;i++){
                    for(int j=1;j<arr.length-i;j++){
                        if(arr[index]<arr[j]){
                            index=j;
                        }
                    }
                    int temp=arr[arr.length-1];
                    arr[arr.length-1]=arr[index];
                    arr[index]=temp;
                }
                for(int i=0;i<arr.length;i++){
                   T2.append(arr[i]+" ");
                }

            }
        });
    }

    public static void main(String [] args){
        new SelectSort();
    }
}
