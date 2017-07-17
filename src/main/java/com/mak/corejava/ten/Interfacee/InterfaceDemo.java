package com.mak.corejava.ten.Interfacee;

public class InterfaceDemo {
	public static void main(String[] args) {
		Animal a = new Goat();
		a.eat();
		System.out.println(a.isAnimal);
		Animal b = new Tiger();
		b.eat();
		System.out.println(b.isAnimal);
	}
}
interface Animal{
	boolean isAnimal=true;
	void eat();
}
class Goat implements Animal{
	public void eat(){
		System.out.println("Goat eating grass");
	}
} 
class Tiger implements Animal{
	public void eat(){
		System.out.println("Tiger eating goat");
	}
}