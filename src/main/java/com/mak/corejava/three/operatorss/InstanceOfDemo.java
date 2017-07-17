package com.mak.corejava.three.operatorss;

public class InstanceOfDemo extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOperatorDemo obj = new TernaryOperatorDemo();
		A aObj = new A();
		B bObj = new B();
		System.out.println(bObj instanceof A);
		System.out.println(obj instanceof Object);
	}
}
class A{}
class B extends A{}