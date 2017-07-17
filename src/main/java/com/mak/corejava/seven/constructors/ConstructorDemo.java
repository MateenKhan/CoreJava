package com.mak.corejava.seven.constructors;

public class ConstructorDemo {
	ConstructorDemo(){
		System.out.println("constructor invoked");
	}
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo();
		new ConstructorDemo();
		
	}
}
