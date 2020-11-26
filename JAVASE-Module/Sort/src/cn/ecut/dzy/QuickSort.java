package cn.ecut.dzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuickSort extends JFrame {
    private JFrame f;
    private JTextArea T1;
    private JTextArea T2;
    private JButton B1;
    private JButton B2;
    private int [] arr1=new int[10];
    public QuickSort(){
        f=new JFrame("快速排序：");
        T1=new JTextArea(1,40);
        T2=new JTextArea(3,40);
        B1 =new JButton("生成随机数");
        B2 =new JButton("快速排序");
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
                sort(arr1,0,arr1.length-1);

            }
        });
    }

    public void sort(int arr[],int lowindex,int highindex){
            int lo=lowindex;
            int hi=highindex;
            int min;
            if(highindex>lowindex){
                min=arr[(lowindex+highindex)/2];
                while(lo<=hi){
                    while((lo<highindex)&&(arr[lo]<min))
                        ++lo;
                    while((hi>lowindex)&&(arr[hi]>min))
                        --hi;
                    if(lo<=hi){
                      swap(arr,lo,hi);
                      ++lo;
                      --hi;
                    }

                }
                if(lowindex<hi){
                    sort(arr,lowindex,hi);
                }
                if(lo<highindex){
                    sort(arr,lo,highindex);
                }

            }
        }

    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        for(int k=0;k<arr.length;k++){
            T2.append(arr[k]+" ");
        }
        T2.append("\n");
    }
    public static void main(String [] args){
        new QuickSort();
    }
}
