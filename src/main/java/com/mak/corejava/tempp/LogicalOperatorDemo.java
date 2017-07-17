package com.mak.corejava.tempp;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
//		int a=10;int b=20;int c=30;
//		System.out.println(!((a<b)&&(b<c)));//true&&true
//		System.out.println(((a>b)&&(b>c)));//false&&false
//		System.out.println(((a<b)||(b<c)));//true||true
//		System.out.println(((a>b)||(b>c)));//false||false
		String name= "kapil";
		if(!isValidStr(name)){
			System.out.println("invalid name");
		}else{
			System.out.println("valid name");
		}
	}
	
	public static boolean isValidStr(String str){
		boolean result = false;
		if(str!=null&&str.trim().length()>5){
			result=true;
		}
		return result;
	}
	
}
