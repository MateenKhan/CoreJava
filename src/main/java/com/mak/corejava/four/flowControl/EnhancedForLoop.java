package com.mak.corejava.four.flowControl;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ForDemo obj = new ForDemo();
//		System.out.println(obj.ias);
		
		int arr[]={1,2,321,4,5,6};
//		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
//		}
		
		for(int temp:arr){
			System.out.println(temp);
		}
	}

}
