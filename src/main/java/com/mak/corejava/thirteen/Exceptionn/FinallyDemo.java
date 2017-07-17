package com.mak.corejava.thirteen.Exceptionn;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		one();
		System.out.println("main ended");
	}
	
	public static void one(){
		
		try {
//			int a= 10/0;
		}
//		catch (Exception e) {
//			System.out.println("Exception");
//		}
		finally{
			System.out.println("this line must be executed");
		}
		
		
	}

}
