package com.mak.corejava.eighteen.multiThreading;

public class Basic {

	public static void main(String[] args) {
		B obj = new B();
//		obj.start();
		obj.run();
		for(int i=0;i<5;i++){
			System.out.println("main:"+i);
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}


//extending Thread
class B extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("thread:"+i);
			try {
				Thread.currentThread().sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

