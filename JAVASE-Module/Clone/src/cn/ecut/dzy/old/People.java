package cn.ecut.dzy.old;

public class People {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+name+"年龄："+age;
    }
    public static void main(String [] args){
        System.out.println("克隆之前：");
        People p=new People();
        p.setAge(12);
        p.setName("ww");
        System.out.println("p的信息："+p);
        System.out.println("克隆之后：");
        People p1=p;
        p1.setName("ddd");
        p1.setAge(344);
        System.out.println("p的信息："+p);
        System.out.println("p1的信息："+p1);
    }
}
