package cn.ecut.dzy;

import javax.swing.*;
import java.awt.*;

public class MultbuttonDemo extends JFrame {
    private JFrame jf;
    private JPanel jp;
    public MultbuttonDemo(){
        jf=new JFrame("多选框");
        jf.add(get());
        jf.setVisible(true);
        jf.setBounds(300,300,400,400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public JPanel get(){
        if(jp==null){
            jp=new JPanel();
            jp.setLayout(new GridLayout(0,4));
            String [] arr={"跳舞","唱歌","游戏","睡觉","开飞机","开火车","骑自行车","听歌","聊天","下棋","王者","吃鸡"};
            JCheckBox [] box=new JCheckBox[arr.length];
            for(int i=0;i<box.length;i++){
                box[i]=new JCheckBox(arr[i]);
                jp.add(box[i]);
            }
        }
        return jp;
    }
    public static void main(String [] main){
        new MultbuttonDemo();
    }

}
