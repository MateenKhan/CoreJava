package com.mak.corejava.tweleve.ioo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamReaderWriterDemo {
	
	public static void main(String[] args) throws Exception{
		
		FileInputStream 		fis = new FileInputStream("temp.txt");
		FileOutputStream	fos =  new FileOutputStream("tempOutput.txt",true); 

		int i;
		while( ( i = fis.read() ) != -1)
		{
			fos.write(i);
		}
		fos.flush();
		
		System.out.println("Data has written");
		fis.close();fos.close();
	}

}
