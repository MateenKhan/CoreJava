package com.mak.corejava.seven.inheritancee;

public class OverRidingdemo2 {

	public static void main(String[] args) {
		Car car;//declaration
		car = new Ferrari();//intialization ;; run time polymorphism
		car.topSpeed();
//		car.getMileage();
//		System.out.println("Car topSpeed is :"+car.isGpsAvailable);
		
		/*Car car;//declaration
		car = new Car();//intialization
		car.topSpeed();

		Ferrari ferrari;
		ferrari = new Ferrari();
		ferrari.topSpeed();
		*/
	}

}
