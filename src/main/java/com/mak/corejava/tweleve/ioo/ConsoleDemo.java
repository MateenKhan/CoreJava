package com.mak.corejava.tweleve.ioo;

import java.io.Console;
import java.io.IOException;

public class ConsoleDemo {
	
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter text:" );

		Console keyboard = System.console();

		if(keyboard!=null){
		String line = keyboard.readLine();

		System.out.print("You entered: "+line);
		}
	}

}
