package com.mak.corejava.four.flowControl;

public class ShortCircutDemo {

	public static void main(String[] args) {
		int a=10,b=20;
		if(a<b||b>a||a==b||a!=b||a>23){
			System.out.println("if condition1 block");
		}
		
		if(a<b&&b>a&&a==b&&a!=b&&a>23){
			System.out.println("if condition2 block");
		}
	}
}
