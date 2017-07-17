package com.mak.corejava.seventeen.CollectionFrameworkk;

import java.util.ArrayList;

public class CollectionDemo {
protected static int a=10;
	public static void main(String[] args) {
		
//		int arr[]= {1,2,3,4,5};
//		arr[5]=3;
//		int temp[]=new int[6];
//	
//		for(int i=0;i<arr.length;i++){
//			temp[i]=arr[i];
//		}
//		temp[5]=6;
//		for(int i=0;i<temp.length;i++){
//			System.out.println(temp[i]);
//		}
		
		ArrayList list = new ArrayList();
		for(int i=1;i<=5;i++){
			list.add(i);
		}
		list.add(6);list.add(7);
		System.out.println(list);
	}

}

abstract class A{}
interface i{}
class II implements i{}
class C extends A{}
class B{
	
	A obj = new C();//?
	i obj2 = new II();//?
}




