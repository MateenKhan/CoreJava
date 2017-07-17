package com.mak.corejava.four.flowControl;
class SwitchDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("before switch");
		int a=1;
		switch(a)
		{
			case 1:			
				System.out.println("in case1 start");
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 1 end");
				break;
			case 2:
				System.out.println("in case 2 start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 2 end");
				break;
			case 3:
				System.out.println("in case 3 start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in case 3 end");
				break;
			 default :
				System.out.println("in default start");			
				System.out.println("in switch");
				System.out.println("in switch");
				System.out.println("in default end");
		}

		System.out.println("after switch"); 
	}
}