package com.mak.corejava.seven.inheritancee;

public class Ferrari extends Car {

	private String color="red";
	int topSpeed=360;
	public boolean isGpsAvailable=true;
	
	@Override
	public void topSpeed(){
		System.out.println("Ferrari Top Speed:"+topSpeed);
	}
	
	public void printColor(){
		System.out.println("Ferrai Default Color:"+color);
	}
}
