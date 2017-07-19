package com.mak.corejava.eight.thisAndSuper;

//this

class BaseSuper {
	BaseSuper() {
		System.out.println("BaseSuper class constructor");
	}
}

class DerivedChild extends BaseSuper {
	DerivedChild() {
		super();
		System.out.println("DerivedChild class Constructor");
	}
	
	void sendMail(String emailid){
		System.out.println("sending mail to:"+emailid);
	}
}

class Second {
	public static void main(String args[]) {
		new DerivedChild().sendMail("jijinrulz@gmail.com");
	}
}