package com.mak.corejava.tweleve.ioo;

import java.io.IOException;

public class KeyboardReaderDemo2 {

	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter some char:");
		int data = System.in.read();
		System.out.print("You entered: "+(char)data);
	}
	
}
