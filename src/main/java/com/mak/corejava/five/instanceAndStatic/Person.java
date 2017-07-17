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
		this.bankBalance=bankBalance;
	}
	public void setIsMale(boolean isMale){
		this.isMale=isMale;
	}
}
