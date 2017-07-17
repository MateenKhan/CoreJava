package com.mak.corejava.five.instanceAndStatic;

public class InstanceVariablesAndMethods {
	public int a=10;
	public int b=10;
	
	public static void main(String[] args) {
		InstanceVariablesAndMethods obj = new InstanceVariablesAndMethods();
		System.out.println(obj.a+obj.b);
		obj.add();
	}
	
	public void add(){
		System.out.println(this.a+this.b);
	}
}
