package com.abstractofdeom;

/**
 * @author DingZhenYun
 * @create 2019-02-22 14:15
 */
interface Personp{
    void getName();
    void getPirce();
}

class H implements Personp {

    @Override
    public void getName() {
        System.out.println("P");
    }

    @Override
    public void getPirce() {
        System.out.println(123);
    }
}

public class Test {
    public static void main(String[] args) {
        Test t=new Test();
        //1实现局部内部类
        H h=new H();
        t.show(h);
        //2实现接口的匿名的局部内部类
        Personp p=new Personp() {
            @Override
            public void getName() {
                System.out.println("pp");
            }

            @Override
            public void getPirce() {
                System.out.println(45);
            }
        };
        t.show(p);
        //3匿名类的匿名对象
        t.show(new Personp() {
            @Override
            public void getName() {
                System.out.println("2334");
            }

            @Override
            public void getPirce() {
                System.out.println(1);
            }
        });


        System.out.println();
        Personp p2=t.getp();
        p2.getPirce();
        p2.getName();

    }
    public void show(Personp personp){
        personp.getName();
        personp.getPirce();
    }
    public Personp getp(){
        //局部内部类的使用
//        class  Cir implements Personp{
//
//            @Override
//            public void getName() {
//                System.out.println("索尼");
//            }
//
//            @Override
//                public void getPirce() {
//                System.out.println(2324);
//                }
//        }
//        return new Cir();
        //2
        return new Personp() {
            @Override
            public void getName() {
                System.out.println(11);
            }

            @Override
            public void getPirce() {
                System.out.println(222);
            }
        };
    }
}
