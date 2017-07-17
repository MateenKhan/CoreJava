package com.mak.corejava.eighteen.multiThreading;

public class Third {

	public static void main(String[] args) {
		E obj1 = new E();obj1.setName("t1");
		E obj2 = new E();obj2.setName("t2");
		E obj3 = new E();obj3.setName("t3");
		E obj4 = new E();obj4.setName("t4");
		obj4.setPriority(10);
		obj3.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj1.start();obj2.start();obj3.start();obj4.start();
		System.out.println("t1:"+obj1.getPriority());
		System.out.println("t2:"+obj2.getPriority());
		System.out.println("t3:"+obj3.getPriority());
		System.out.println("t4:"+obj4.getPriority());
		System.out.println("main completed");
	}
}

class E extends Thread{
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

