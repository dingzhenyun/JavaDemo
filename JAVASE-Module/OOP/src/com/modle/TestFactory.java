package com.modle;

/**
 * @author DingZhenYun
 * @create 2019-02-20 20:28
 */
/*
概述：工厂方法(FactoryMethod)

定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。

适用性：
1. 当一个类不知道它所必须创建的对象的类的时候
2. 当一个类希望由它的子类来指定它所创建的对象的时候
3. 当类将创建对象的职责委托给多个帮助子类中的某一个，
并且你希望将哪一个帮助子类是代理者这一信息局部化的时候

 */
interface IWorkFactoy{
    Work getWork();
}

class StudentWorkFactory implements IWorkFactoy {

    @Override
    public Work getWork() {
        return new StudentWork();
    }
}

class TeacherWorkFactory implements IWorkFactoy {

    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}

interface Work{
    void dowork();
}

class StudentWork implements Work {

    @Override
    public void dowork() {
        System.out.println("学生写作业");
    }
}

class TeacherWork implements Work {

    @Override
    public void dowork() {
        System.out.println("老师批改作业");
    }
}

public class TestFactory {
    public static void main(String[] args) {
        IWorkFactoy i=new StudentWorkFactory();
        i.getWork().dowork();
        IWorkFactoy i1=new TeacherWorkFactory();
        i1.getWork().dowork();
    }
}
