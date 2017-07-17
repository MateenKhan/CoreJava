package com.mak.corejava.five.instanceAndStatic;

public class StaticMembers {

	public static int a=10;
	public int b=10;
	
	public static void printString(){
		System.out.println(a);
	}
	
	public void printString2(){
		System.out.println(this.a);
	}
}
