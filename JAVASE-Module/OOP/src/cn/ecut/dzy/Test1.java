package cn.ecut.dzy;

/**
 * @author DingZhenYun
 * @create 2020-10-27 22:30
 * 定义
 * 类 Student ，包含三个属性：学号 number(int) int)，年级 state(int) int)，成绩
 * score(int) 。 创建 20 个学生对象，学号为 1 到 20 ，年级和成绩都由随机数 确定。
 * 问题一：打印
 * 出 3 年级 (state 值为 3 ）的学生信息 。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class Test1 {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student [] count=new Student[20];
        for(int i=1;i<=20;i++){
            Student student=new Student();
            student.setNumber(i);
            student.setState((int)Math.round(Math.random()*9));
            student.setScore((int)Math.round(Math.random()*101));
            //年级：[1,6]
          // (int)(Math.random() * (6 - 1 + 1) + 1);
            //成绩：[0,100]
            //(int)(Math.random() * (100 - 0 + 1));
            count[i-1]=student;
        }
        for(int i=0;i<20;i++){
            System.out.println(count[i].toString());

        }
        for (int i=0;i<20;i++){
            if(count[i].getState()==3){
                System.out.println(count[i].toString());
            }
        }
        System.out.println("---遍历");
        for (int i=0;i<20;i++){
            for(int j=0;j<20-i-1;j++){
                if(count[j].getScore()>count[j+1].getScore()){
                    Student student=count[j];
                    count[j]=count[j+1];
                    count[j+1]=student;
                }
            }

        }
        for(int i=0;i<20;i++){
            System.out.println(count[i].toString());

        }
    }

}
