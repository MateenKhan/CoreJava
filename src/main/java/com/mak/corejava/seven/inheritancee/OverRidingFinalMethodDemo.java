package com.mak.corejava.seven.inheritancee;

public class OverRidingFinalMethodDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class A100{
	final void print(){
		System.out.println("final method");
	}
}

class A101 extends A100{
//	@Override
//	final void print(){
//		System.out.println("final method");
//	}
}
