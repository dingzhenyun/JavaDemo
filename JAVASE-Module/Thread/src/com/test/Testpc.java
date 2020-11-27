package com.test;

/**
 * @author DingZhenYun
 * @create 2019-03-14 9:20
 */
/*
 * 生产者/消费者问题
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品。

	分析：
	1.是否涉及到多线程的问题？是！生产者、消费者
	2.是否涉及到共享数据？有！考虑线程的安全
	3.此共享数据是谁？即为产品的数量
	4.是否涉及到线程的通信呢？存在这生产者与消费者的通信

 */
class Cleak{
    int number;
    //生产
    public synchronized  void p(){
        if(number>=20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            number++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + number);
            notifyAll();
        }
    }
    //消费
    public synchronized  void c(){
        if(number<=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {

            System.out.println(Thread.currentThread().getName() + "消费了第" + number);
            number--;
            notifyAll();
        }
    }

}

class Product implements Runnable{
   Cleak cleak;
    public Product(Cleak cleak){
        this.cleak=cleak;
    }
    @Override
    public void run() {
        System.out.println("开始生产产品");
        while (true){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleak.p();
        }
    }
}

class Customer implements Runnable{
    Cleak cleak;
    public Customer(Cleak c){
        this.cleak=c;
    }
    @Override
    public void run() {
        System.out.println("开始消费产品");
        while(true){
            try {
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleak.c();
        }
    }
}

public class Testpc {
    public static void main(String[] args) {
        Cleak c=new Cleak();
        Product product=new Product(c);
        Customer customer=new Customer(c);
        Thread t1=new Thread(product);//生产者
        Thread t2=new Thread(product);//生产者
        Thread t3=new Thread(customer);//消费者
        t1.setName("生产者1");
        t2.setName("生产者2");
        t3.setName("消费者");
        t1.start();
        t2.start();
        t3.start();
    }
}
