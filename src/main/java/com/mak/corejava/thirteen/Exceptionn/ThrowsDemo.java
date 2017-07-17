package com.mak.corejava.thirteen.Exceptionn;

public class ThrowsDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		try{
			throwException();
//		}catch(Exception e){System.out.println("exception occured");}
//		throwException();
	}

	public static void throwException() throws Exception,ArrayIndexOutOfBoundsException,ArithmeticException{
//		try{
//		throw new Exception();
//		}catch(Exception e){}
		
		throw new Exception();
	}
}
