package com.mak.corejava.four.flowControl;
class BreakContinueDemo 
{
	public static void main(String[] args) 
	{
//		System.out.println("\nbreak output");
//		for (int i = 0; i < 5; i++)
//		{
//				if(i == 3)
//				{
//					break;
//				}
//				System.out.println("    "+i + "");
//		}

		System.out.println("\nContinue output");
		for (int i = 0; i < 5; i++)
		{
				if(i == 0)
				{
					continue;
				}
				System.out.println("    "+i + "");
		}

	}
}