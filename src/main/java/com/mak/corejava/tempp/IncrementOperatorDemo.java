package com.mak.corejava.tempp;

public class IncrementOperatorDemo {
	
	public static void main(String[] args) {
		int a=10;
		//a++;//post increment
		//++a;//pre increment
		int c=10+(++a)+(a++)+1;
		System.out.println("before operation:"+a);
		System.out.println("while operating:"+(a--));
		System.out.println("after operation:"+a);
	}

}
