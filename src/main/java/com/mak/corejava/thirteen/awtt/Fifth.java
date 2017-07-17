package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Fifth extends Frame
{
	Fifth()
	{
		setLayout(new FlowLayout());
		setTitle("Checkbox Frame");
		setVisible(true);
		setSize(500,500);

		Checkbox Win98 = new Checkbox("Windows 98/XP", null, true);
		Checkbox winNT = new Checkbox("Windows NT/2000",true);
		Checkbox solaris = new Checkbox("Solaris");
		Checkbox mac = new Checkbox("MacOS");

		add(Win98);
		add(winNT);
		add(solaris);
		add(mac);
		//System.out.println(mac.getLabel());
	}
	public static void main(String[] args) 
	{
		new Fifth();
	}
}
