package com.mak.corejava.thirteen.Exceptionn;

public class First {

	public static void main(String[] args) {
		System.out.println("Excecution started");
		try{
			int a = 2/0;
		}catch(Exception e){
			System.out.println("Exception caught");
		}
		System.out.println("after division");
		
	}
	
}
