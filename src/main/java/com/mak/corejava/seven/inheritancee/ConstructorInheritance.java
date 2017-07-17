package com.mak.corejava.seven.inheritancee;

class Foo{
	Foo(){
		System.out.println("Foo");
	}
}

class BaseClassA extends Foo{
	BaseClassA(){
		super();
		System.out.println("BaseClassA");
	}
}

class ChildClassB extends BaseClassA{
	ChildClassB(){
		super();
		System.out.println("ChildClassB");
	}
}

public class ConstructorInheritance {
	public static void main(String[] args) {
		new ChildClassB();
	}
}