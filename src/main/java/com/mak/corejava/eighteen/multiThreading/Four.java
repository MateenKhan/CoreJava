package com.mak.corejava.eighteen.multiThreading;

public class Four {

	public static void main(String[] args) throws Exception{
		F obj1 = new F();
		obj1.setDaemon(true);
		obj1.start();
		Thread.currentThread().sleep(2000);
		System.out.println("main completed");
		System.out.println("F isDaemon():"+obj1.isDaemon());
	}
}

class F extends Thread{
	public void run(){
		for(int i=0;;i++){
//		while(true){
			System.out.println("thread:"+i);
			try {
				Thread.currentThread().sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//		System.out.println(Thread.currentThread().getName()+":thread completed");
	}
}

