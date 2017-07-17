package com.mak.corejava.nine.abstractClasses;

public class AbstractClassPolymorphism {
	public static void main(String[] args) {

		Parent obj = new Child();
		obj.mul(10, 20);
	}
}

abstract class Parent {
	Parent() {
		System.out.println("Abstract class constructor");
	}

	public abstract void mul(int a, int b);
}

class Child extends Parent {
	@Override
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
}