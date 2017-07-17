package com.mak.corejava.thirteen.Exceptionn;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("main started");
		try{
			throw new MyException();
		}catch(MyException e){
			System.out.println("Caught MyException");
			e.importantMethod();
		}
		System.out.println("main ended");

	}

}

class MyException extends Exception{
	
	public void specfyException(){
		System.out.println("My Exception has raised");
	} 
	
	public void importantMethod(){
		System.out.println("Important method invoked ");
	}
	
}