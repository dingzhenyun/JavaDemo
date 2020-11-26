package cn.ecut.dzy;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class ArraysTable extends JFrame {
    private JFrame f;
    private JScrollPane JS;
    //private JTextArea T;
    private JTable jt;
    public  ArraysTable(){
        f=new JFrame("数组设置表格");
        //T=new JTextArea(100,120);
        JS=new JScrollPane(get());
        f.add(JS);

        f.setVisible(true);
        f.setBounds(300,300,500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public JTable get(){
        if(jt==null){
            jt=new JTable();
            String [] conumns={"ID","姓名","性别","出生日期","邮箱","居住地","备注"};
            int [] columnsWidth={10,30,10,40,70,60,70};
            //创建表格数据模型
            DefaultTableModel model=new DefaultTableModel(conumns,15);
            jt.setModel(model);//设置表格数据模型
            TableColumnModel tcm=jt.getColumnModel();
            int count=tcm.getColumnCount();
            for(int i=0;i<count;i++){
                TableColumn column=tcm.getColumn(i);
                 column.setPreferredWidth(columnsWidth[i]);
            }
        }
        return jt;
    }
    public static void main(String [] args){
        new ArraysTable();
    }

}
