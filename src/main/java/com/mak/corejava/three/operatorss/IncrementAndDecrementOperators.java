
package com.mak.corejava.three.operatorss;

class IncrementAndDecrementOperators 
{
	public static void main(String[] args) 
	{
		int a = 10;
		a++;
		System.out.println("a++:"+a++);//11
		System.out.println("a:"+a);//11
		int b = 20;
		++b ;
		System.out.println("++b:"+(++b));//21


		
		int z = 5;
		System.out.println(z++ + ++z + --z + z-- + z - z-- +z);

	}
}
