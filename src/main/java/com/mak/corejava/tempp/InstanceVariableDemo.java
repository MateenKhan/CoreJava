package com.mak.corejava.tempp;

public class InstanceVariableDemo {

	int num1;
	int num2;
	int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo obj = new InstanceVariableDemo();
		obj.addNumbers();
	}

	public void addNumbers(){
		result= num1+num2;
		System.out.println("result:"+(result));
	}
	
	
}
