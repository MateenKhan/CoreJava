package com.mak.corejava.tweleve.ioo;

import java.io.File;
import java.io.IOException;


public class FileDemo {

	public static void main(String[] args) throws Exception{
		
//		File fObj= new File("C:/2adsasfasdfasdf.txt");
		
		File fObj2 = new File("C:/2.txt");
//		System.out.println("fObj2.exists():"+fObj2.exists());
		if(!fObj2.exists()){
			try {
				fObj2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		System.out.println("After Creation:"+fObj2.exists());
//		if(!fObj.exists()){
//			fObj.createNewFile();
//		}
//		System.out.println("After Creation:"+fObj.exists());
//		fObj2.delete();
//		System.out.println("After Deletion:"+fObj2.exists());
		System.out.println("fObj.getAbsolutePath():"+fObj2.getAbsolutePath());
		System.out.println("fObj.getName():"+fObj2.getName());
		System.out.println("fObj.getPath():"+fObj2.getPath());
		System.out.println("fObj.TotalSpace():"+fObj2.getTotalSpace());
	}

}
