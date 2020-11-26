package cn.ecut.dzy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class ButtonDemo extends JFrame {
    private static int x1;
    private static int x2;
    private static boolean f;
    private JFrame JF;
    private static  JTextField JTF;
    private static JPanel JP;
    private static JButton [][] B;
    public ButtonDemo(){
        BorderLayout b=(BorderLayout) getContentPane().getLayout();
        b.setHgap(20);
        b.setVgap(10);
        JTF=new JTextField();
        JTF.setHorizontalAlignment(SwingConstants.TRAILING);
        JTF.setPreferredSize(new Dimension(12,50));
        getContentPane().add(JTF,BorderLayout.NORTH);
        JTF.setColumns(10);
        final GridLayout g=new GridLayout(4,4);
        g.setHgap(5);
        g.setVgap(5);
        JP =new JPanel();
        JP.setLayout(g);
        getContentPane().add(JP,BorderLayout.CENTER);
        String [][] names={{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","*"},{".","0","=","/"}};
        B=new JButton[4][4];
        for(int row=0;row<B.length;row++){
            for(int col=0;col<B.length;col++){
               B[row][col] =new JButton(names[row][col]);
               JP.add(B[row][col]);
            }
        }

        setTitle("计算器");
        setBounds(400,400,400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//文本对齐方式
        init();

    }
    private  static void Text(JButton button){
       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String str=button.getText();
               JTF.setText(JTF.getText()+str);
           }
       });
    }

    private static void init() {
        Text(B[0][0]);
        Text(B[0][1]);
        Text(B[0][2]);
        Text(B[0][3]);
        Text(B[1][0]);
        Text(B[1][1]);
        Text(B[1][2]);
        Text(B[1][3]);
        Text(B[2][0]);
        Text(B[2][1]);
        Text(B[2][2]);
        Text(B[2][3]);
        Text(B[3][0]);
        Text(B[3][1]);
        Text(B[3][3]);

        B[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTF.setText(JTF.getText()+B[3][2].getText());
                if(JTF.getText().contains("+")){
                    StringTokenizer st1 = new StringTokenizer(JTF.getText(),"+");
                    double d1,d2 = 0;
                    d1 = Double.parseDouble(st1.nextToken());
                    while(st1.hasMoreTokens()){
                        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                       // System.out.println("str2======"+st2.nextToken());
                        d2 = Double.parseDouble(st2.nextToken());
                    }
                    JTF.setText(JTF.getText()+""+(d1+d2));
                }
                else if(JTF.getText().contains("-")){
                    StringTokenizer st1 = new StringTokenizer(JTF.getText(),"-");
                    double d1,d2 = 0;
                    d1 = Double.parseDouble(st1.nextToken());
                    while(st1.hasMoreTokens()){
                        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                        // System.out.println("str2======"+st2.nextToken());
                        d2 = Double.parseDouble(st2.nextToken());
                    }
                    JTF.setText(JTF.getText()+""+(d1-d2));
                }
                else if(JTF.getText().contains("*")){
                    StringTokenizer st1 = new StringTokenizer(JTF.getText(),"*");
                    double d1,d2 = 0;
                    d1 = Double.parseDouble(st1.nextToken());
                    while(st1.hasMoreTokens()){
                        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                        // System.out.println("str2======"+st2.nextToken());
                        d2 = Double.parseDouble(st2.nextToken());
                    }
                    JTF.setText(JTF.getText()+""+(d1*d2));
                }
                else if(JTF.getText().contains("/")){
                    StringTokenizer st1 = new StringTokenizer(JTF.getText(),"/");
                    double d1,d2 = 0;
                    d1 = Double.parseDouble(st1.nextToken());
                    while(st1.hasMoreTokens()){
                        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                        // System.out.println("str2======"+st2.nextToken());
                        d2 = Double.parseDouble(st2.nextToken());
                    }
                    JTF.setText(JTF.getText()+""+(d1/d2));
                }

            }
        });
    }

    public static void main(String [] args){
        new ButtonDemo();
    }
}
