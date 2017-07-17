package com.mak.corejava.five.instanceAndStatic;

public class StaticVariablesAndMethods {

	static int a = 10;
	static int b = 10;

	public static void main(String[] args) {
		System.out.println(StaticVariablesAndMethods.a + StaticVariablesAndMethods.b);
		StaticVariablesAndMethods.add();
	}

	static void add() {
		System.out.println(a + b);
	}
}
