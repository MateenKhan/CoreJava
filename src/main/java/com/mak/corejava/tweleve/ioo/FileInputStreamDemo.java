package com.mak.corejava.tweleve.ioo;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception{
		FileInputStream fin =null;
		try {
			File file = new File("temp.txt");
			if(file.exists()){
				fin = new FileInputStream(file);
				int data = fin.read();
				do{
					System.out.print((char)data);
					data =fin.read();
				}while(data!=-1);
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(null!=fin){
				fin.close();
			}
		}
	}
}
