package com.mak.corejava.tweleve.ioo;

import java.io.*;

public class DirectoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			File f = new File("C:/tempJava");
//			System.out.println("f.isDirectory():"+f.isDirectory());
//			if(!f.exists()){
//				f.mkdir();
//			}
//			System.out.println("Before delete f.exists():"+f.exists());
//			f.delete();
//			System.out.println("After delete f.exists():"+f.exists());
			File f = new File("C:/Program Files");
			System.out.println("f.is file:"+f.isFile());
			System.out.println("f.is directory:"+f.isDirectory());
			String files[] = f.list();
//			for(int i=0;i<files.length;i++){
//				String file = files[i];
//				System.out.println(file);
//			}
			for(String file:files){
				System.out.println(file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
