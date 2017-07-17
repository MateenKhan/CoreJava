package com.mak.corejava.thirteen.Exceptionn;

public class PrintStackTraceDemo {

	public static void main(String[] args) {
		
		System.out.println("main started");
//		try{
//			floor10();
//		}catch(Exception e){
//			System.out.println("Exception Raised");
//			e.printStackTrace();
//		}
		try{
			floor10();
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException ");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
			e.printStackTrace();
			}catch(Exception e){
				System.out.println("Exception ");
				e.printStackTrace();
			}
		System.out.println("main ended");

	}
	
	public static void floor10(){
		floor9();
	}
	public static void floor9(){
		floor8();
	}
	public static void floor8(){
		floor7();
	}
	public static void floor7(){
		floor6();
	}
	public static void floor6(){
//		int a=10/0;
		int arr[]={1,23,3};
		System.out.println(arr[22]);
	}

}
