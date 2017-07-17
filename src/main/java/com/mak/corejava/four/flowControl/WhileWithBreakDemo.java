package com.mak.corejava.four.flowControl;

public class WhileWithBreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10)
		{
			if(i==6)
			{
				break;
			}
			System.out.println("In while: " + i);
			i++;
		}
	}

}
