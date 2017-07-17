package com.mak.corejava.tweleve.ioo;

import java.util.Scanner;

public class KeyboardReaderDemo4 {

	 public static void main(String args[]){  
		   
		   Scanner sc=new Scanner(System.in);  
		   try{
			   System.out.println("Enter your rollno");  
			   int rollno=sc.nextInt();  
			   System.out.println("Enter your name");  
			   String name=sc.next();  
			   System.out.println("Enter your fee");  
			   double fee=sc.nextDouble();  
			   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);
			   System.out.println("Enter text");
			   String str = sc.next();
			   System.out.println(str);
		   }catch(Exception e){
			   System.out.println("Exception occured");
		   }
		   finally{
			   sc.close();
		   }
		 } 
}
  