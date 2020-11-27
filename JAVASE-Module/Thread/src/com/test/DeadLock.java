package com.test;

class A {
	public synchronized void foo(B b) {
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName()
				+ " ������Aʵ����foo����"); // ��
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName()
				+ " ��ͼ����Bʵ����last����"); // ��
		b.last();
	}

	public synchronized void last() {
		System.out.println("������A���last�����ڲ�");
	}
}

class B {
	public synchronized void bar(A a) {
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName()
				+ " ������Bʵ����bar����"); // ��
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("��ǰ�߳���: " + Thread.currentThread().getName()
				+ " ��ͼ����Aʵ����last����"); // ��
		a.last();
	}

	public synchronized void last() {
		System.out.println("������B���last�����ڲ�");
	}
}

public class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	public void init() {
		Thread.currentThread().setName("���߳�");
		// ����a�����foo����
		a.foo(b);
		System.out.println("���������߳�֮��");
	}

	public void run() {
		Thread.currentThread().setName("���߳�");
		// ����b�����bar����
		b.bar(a);
		System.out.println("�����˸��߳�֮��");
	}

	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();
		dl.init();
	}
}
