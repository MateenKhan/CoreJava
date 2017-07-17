package com.mak.corejava.tempp;

public class StaticVariableDemo {
	static int num1=10;
	static int num2=10;
	static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableDemo obj = new StaticVariableDemo();
		obj.addNumbers();
	}

	public void addNumbers(){
		result= num1+num2;
		System.out.println("result:"+(result));
	}
	
}
