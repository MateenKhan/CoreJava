package com.mak.corejava.tweleve.ioo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardReaderDemo1 {
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter First int number: ");
		String n1 = br.readLine();

		System.out.print("Enter second int number: ");
		String n2 = br.readLine();
		int a=0,b=0;
		try{
			a = Integer.parseInt(n1);
			b = Integer.parseInt(n2);
		}catch(NumberFormatException e){
			System.out.println("Invalid data");
		}
		int c = a + b;

		System.out.print("Result: "+ c);

	}


}
