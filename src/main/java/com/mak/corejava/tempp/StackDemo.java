package com.mak.corejava.tempp;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodA();
		System.out.println("main");
	}
	
	public static void methodA(){
		methodB();
		System.out.println("method A");
	}
	public static void methodB(){
		methodC();
		System.out.println("method B");
	}
	public static void methodC(){
		System.out.println("method C");
	}

}
