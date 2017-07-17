package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Third extends Frame
{
	Third()
	{
		setLayout(new FlowLayout());
		setTitle("Label Frame");
		setVisible(true);
		setSize(500,500);

		Label l1 = new Label("One");
		Label l2 = new Label("Two");
		Label l3 = new Label();
		Label l4 = new Label("adsfads");
		Label l5 = new Label("trhfg");
		Label l6 = new Label();
		Label l7 = new Label("dfgbx");
		Label l8 = new Label("fghkfgh");
		Label l9 = new Label();
		add(l1);
		add(l2);
		l3.setText("THREE");
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);

	}
	public static void main(String[] args) 
	{
		 new Third();			
	}
}
