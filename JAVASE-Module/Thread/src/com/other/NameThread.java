package com.other;
/*
 *  ��ȡ�߳�����,����Thread����
 *    String getName()
 */
public class NameThread extends Thread{
	
	public NameThread(){
		super("小区");
	}
	
	public void run(){
		System.out.println(getName());
	}
}
