package com.mak.corejava.six.overloadingAndConstructoss;

public class VarargValidation {
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		System.out.println("main completed");
	}
	
	public static void add(int... values){
		int result=0;
		for(int a:values){
			if(validateArg(a)){
				result+=a;
			}else{
				System.out.println("invalid input");
				return;
			}
		}
		System.out.println(result);
	}
	
	public static boolean validateArg(int... args){
		boolean result=true;
		for(int temp:args){
			if(temp<0||temp>10000){
				result=false;
				break;
			}
		}
		return result;
	}
}
