package com.mak.corejava.seven.constructors;

public class ConstructorOverloading {
	int a;
	int b;
	ConstructorOverloading(){
		System.out.println("zero arg constructor");
	}
	ConstructorOverloading(int a){
		this.a=a;
	}
	ConstructorOverloading(int a,int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(10,20);
		obj.add();
	}
	public void add(){
		System.out.println(this.a+this.b);
	}
}
