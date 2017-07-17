package com.mak.corejava.tweleve.ioo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterDemo {
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("temp.txt" ));

		BufferedWriter bw = new BufferedWriter(new FileWriter("tempOutput.txt",true));

		String s ;
		while ( br.ready())
		{
			s = br.readLine();
			
			bw.write(s+"\n");  //=> writes data to file
			bw.flush();

			System.out.println(s);	//=> writes data to console
		}
	}

}
