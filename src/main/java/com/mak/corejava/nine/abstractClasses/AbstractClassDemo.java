package com.mak.corejava.nine.abstractClasses;

public class AbstractClassDemo {
	public static void main(String[] args) {
		B obj = new B();
		obj.add(10,20);
	}
}
abstract class A{

	public abstract void add(int a,int b);
}
class B extends A{
	public  void add(int a,int b){
		System.out.println(a+b);
	}
}