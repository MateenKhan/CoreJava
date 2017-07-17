package com.mak.corejava.thirteen.awtt;
import java.awt.*;

public class Twelve extends Frame 
{
	Twelve() 
	{
		String msg = "The reasonable man adapts " +
		"himself to the world;\n" +
		"the unreasonable one persists in " +
		"trying to adapt the world to himself.\n" +
		"Therefore all progress depends " +
		"on the unreasonable man.\n\n" +
		" - George Bernard Shaw\n\n";

		setLayout(new GridLayout(3,2));

		Button b = new Button("This is first Button click.");
		Label l = new Label("This is the second label");
		Button b1 = new Button("Helllloooo");
		Button b2 = new Button("Clickkkkkkkk");		
		TextArea area = new TextArea(msg);

		add(b);
		add(l);
		add(b1);
		add(b2);
		add(area);

		setTitle("GridLayout Frame");
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String a[])
	{
		new Twelve();
	}
}