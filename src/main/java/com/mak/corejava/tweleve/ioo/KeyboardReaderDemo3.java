package com.mak.corejava.tweleve.ioo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReaderDemo3 {
	
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter text:" );

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		System.out.print("You entered: "+line);
	}

}
