package com.mak.corejava.eighteen.multiThreading;

public class First {

	public static void main(String[] args) {
		C obj1 = new C();obj1.setName("t1");
		C obj2 = new C();obj2.setName("t2");
		C obj3 = new C();obj3.setName("t3");
		C obj4 = new C();obj4.setName("t4");
		obj1.start();obj2.start();obj3.start();obj4.start();
		for(int i=0;i<5;i++){
//			System.out.println("main:"+i);
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("main completed");
	}
}

class C extends Thread{
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

