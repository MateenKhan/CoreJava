package com.mak.corejava.four.flowControl;

public class SystemExitDemo {

	public static void main(String[] args) {
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		if(true){
			System.exit(0);
		}
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");
	}
	
}
