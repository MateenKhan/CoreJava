package com.mak.corejava.five.instanceAndStatic;

public class Person {

	private int bankBalance;
	private boolean isMale;
	
	public int getBankBalance(){
		return this.bankBalance;
	}
	public boolean getIsMale(){
		return this.isMale;
	}
	
	public void setBankBalance(int bankBalance){
		this.bankBalance=bankBalance;//(first time this == obj, second time this==obj2)
	}
	public void setIsMale(boolean isMale){
		this.isMale=isMale;
	}
}
