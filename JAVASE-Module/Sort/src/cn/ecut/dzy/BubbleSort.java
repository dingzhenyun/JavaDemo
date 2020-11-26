package cn.ecut.dzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class BubbleSort extends JFrame {
            private JFrame f;
            private JTextArea T1;
            private JTextArea T2;
            private JButton B1;
            private JButton B2;
            private int [] arr1=new int[10];
            public BubbleSort(){
                f=new JFrame("选择排序：");
                T1=new JTextArea(1,20);
                T2=new JTextArea(3,20);
                B1 =new JButton("生成随机数");
                B2 =new JButton("冒泡排序");
                f.setLayout(new FlowLayout());
                f.add(T1);
                f.add(B1);
                f.add(T2);
                f.add(B2);
                f.setBounds(300,300,300,300);
                f.setVisible(true);
                f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                init1();
            }

            private void init1() {
                B1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        T1.setText("");
                        Random r=new Random();
                        for(int i=0;i<arr1.length;i++){
                            arr1[i]=r.nextInt(50)+1;
                            T1.append(arr1[i]+" ");
                        }
                    }
                });
                B2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        T2.setText("");
                        for(int i=1;i<arr1.length;i++){
                            for(int j=0;j<arr1.length-i;j++){
                                if(arr1[j]>arr1[j+1]){
                                    int temp=arr1[j];
                                    arr1[j]=arr1[j+1];
                                    arr1[j+1]=temp;
                                }
                                T2.append(arr1[j]+" ");
                            }
                           T2.append("[");
                            for(int j=arr1.length-i;j<arr1.length;j++){
                                T2.append(arr1[j]+" ");
                            }
                            T2.append("]\n");
                        }

                    }
                });
            }

            public static void main(String [] args){
               new BubbleSort();
            }
}


