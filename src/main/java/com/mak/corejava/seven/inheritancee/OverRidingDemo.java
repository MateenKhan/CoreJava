package com.mak.corejava.seven.inheritancee;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine = new Machine();
		System.out.println("Machine color:"+machine.color);
		machine.consumpEclectricity();
		
		Machine refrigirator = new Refrigirator();
		System.out.println("Refrigirator color:"+refrigirator.color);
		refrigirator.consumpEclectricity();
//		Refrigirator refrigirator = new Refrigirator();
//		refrigirator.consumpEclectricity();
	}

}

class Machine{
	String color="black";
	int units=20;
	
	public void consumpEclectricity(){
		System.out.println("Machine Consumption electricity:"+units);
	}
}

class Refrigirator extends Machine{
	int units=50;
	
	@Override
	public void consumpEclectricity(){
		System.out.println("Refrigirator Consumption electricity:"+units);
	}
}