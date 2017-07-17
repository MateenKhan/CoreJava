package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Eleven extends Frame 
{
	Eleven() 
	{
		String msg = "The reasonable man adapts " +
		"himself to the world;\n" +
		"the unreasonable one persists in " +
		"trying to adapt the world to himself.\n" +
		"Therefore all progress depends " +
		"on the unreasonable man.\n\n" +
		" - George Bernard Shaw\n\n";

		setLayout(new BorderLayout());
		Button b = new Button("This is across the top.");

		Label l = new Label("The footer message might go here.");
		Button b1 = new Button("Right");
		Button b2 = new Button("Left");		
		TextArea area = new TextArea(msg);

		add(b,BorderLayout.NORTH);
		add(l,BorderLayout.SOUTH);
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);		
		add(area,BorderLayout.CENTER);

		setTitle("BorderLayout Frame");
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String a[])
	{
		new Eleven();
	}
}