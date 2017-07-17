package com.mak.corejava.thirteen.awtt;
import java.awt.*;
public class Ten extends Frame
{
	Label l1,l2,l3;//create some more and show the working
	public Ten()
	{
	setLayout(new FlowLayout());
		setTitle("Label Frame");
		setVisible(true);
		setSize(500,500);
	
		Panel pa = new Panel();
		pa.setLayout(new FlowLayout());

		l1 = new Label("One");
		l2 = new Label("Two");
		l3 = new Label("Three");
		pa.add(l1);
		pa.add(l2);
		pa.add(l3);
		add(pa);
}

public static void main(String[] args) 
	{
		new Ten();
	}
}
