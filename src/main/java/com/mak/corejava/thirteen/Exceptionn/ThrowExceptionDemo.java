package com.mak.corejava.thirteen.Exceptionn;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		try{
			throw new ArrayIndexOutOfBoundsException();
		}catch(ArithmeticException e){
			System.out.println("Exception");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception");
			e.printStackTrace();
		}
		System.out.println("main ended");
	}

}
