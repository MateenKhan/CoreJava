package com.mak.corejava.tweleve.ioo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("temp.txt"));	
		String line ;
		while(br.ready())
		{
			line = br.readLine();
			System.out.println(line);
		}
	}

}
