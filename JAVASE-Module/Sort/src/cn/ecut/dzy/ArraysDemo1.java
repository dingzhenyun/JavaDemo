package cn.ecut.dzy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//抽奖
public class ArraysDemo1 extends JFrame {
    public void ArraysDemo1(){
        JFrame f=new JFrame("抽奖");
        JTextField T=new JTextField(100);
        JTextArea T1=new JTextArea(10,100);
        JTextArea T2=new JTextArea(20,200);
        JButton B1=new JButton("抽取");
        JButton B2=new JButton("退出");
        f.setLayout(new FlowLayout());
        f.add(T);
        f.add(T1);
        f.add(T2);
        f.add(B1);
        f.add(B2);
        f.setBounds(400,400,300,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String perstring=T2.getText();
                String [] arrays=perstring.split("\n{1,}");
                int index=(int)(Math.random()*arrays.length);
                String info="本次获奖观众为: \n\t%l$s\n恭喜%1$s获取那边。";
                String s=String.format(info,arrays[index]);
                T2.setText(s);
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        T.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //super.keyPressed(e);
                if(e.getKeyChar()!='\n')
                    return;
                int code=e.getKeyCode();
                if(code==KeyEvent.VK_ENTER) {
                    String name = T.getText();
                    if (name.isEmpty())
                        return;
                    T1.append(name + "\n");
                    T.selectAll();
                }
            }
        });

    }
    public static void main(String [] args){
        new ArraysDemo1().ArraysDemo1();
    }
}
