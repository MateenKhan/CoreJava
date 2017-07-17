package com.mak.corejava.six.overloadingAndConstructoss;

public class Addition {
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
	}
	
	public static void add(int a,int b){
		System.out.println("two arg method");
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c){
		System.out.println("three arg method");
		System.out.println(a+b+c);
	}

}
