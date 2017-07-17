package com.mak.corejava.eleven.String;

public class StringConstructorDemo {

	public static void main(String[] args) {

		char arr[] = {'a','b','c'};
		String str1 = new String(arr);
		System.out.println("str1:"+str1);
		
		String str2 = new String();
		System.out.println("str2:"+str2);
		
		String st3="abcd";
	}

}
