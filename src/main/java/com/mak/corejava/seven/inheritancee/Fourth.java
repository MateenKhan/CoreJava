package com.mak.corejava.seven.inheritancee;

class Animal {
	int aa = 10;
	void show() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	int aa = 1000;

	void show() {
		System.out.println("Dog");
	}
}

class Fourth {
	public static void main(String args[]) {
		Animal obj = new Dog();
		System.out.println(obj.aa);
		obj.show();
	}
}