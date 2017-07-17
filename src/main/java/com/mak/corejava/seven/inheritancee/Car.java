package com.mak.corejava.seven.inheritancee;

public class Car {

	private String color="black";
	int topSpeed=100;
	
	public void getMileage(){
		System.out.println("car mileage is 15 kmpl");
	}
	public void topSpeed(){
		System.out.println("Car Top Speed:"+topSpeed);
	}
	
	public void printColor(){
		System.out.println("Car Default Color:"+color);
	}
}
