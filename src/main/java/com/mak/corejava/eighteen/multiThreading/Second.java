package com.mak.corejava.eighteen.multiThreading;

public class Second {

	public static void main(String[] args) {
		C obj1 = new C();obj1.setName("t1");
		D obj2 = new D();obj2.setName("t2");
		D obj3 = new D();obj3.setName("t3");
		D obj4 = new D();obj4.setName("t4");
		obj1.start();obj2.start();obj3.start();obj4.start();
		try {
			Thread.currentThread().join(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("main completed");
	}
}

class D extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
//			System.out.println("thread:"+i);
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(Thread.currentThread().getName()+":thread completed");
	}
}

