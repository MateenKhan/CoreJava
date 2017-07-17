package com.mak.corejava.four.flowControl;

public class NestingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19,pincode=2;
		if(age>=19){
			if(pincode==12345||pincode==0){
				System.out.println("you can apply for canada green card");
			}else{
				System.out.println("you cannot apply for canada green card");
			}
		}else{
			System.out.println("go home kid");
		}
	}

}
