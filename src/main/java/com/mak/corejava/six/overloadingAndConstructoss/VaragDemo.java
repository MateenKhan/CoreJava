package com.mak.corejava.six.overloadingAndConstructoss;

public class VaragDemo {
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
	}
	
	public static void add(int... values){
		int result=0;
		for(int a:values){
			result+=a;
		}
		System.out.println(result);
	}
}
