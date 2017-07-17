package com.mak.corejava.thirteen.awtt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Second
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.setTitle("My first frame");
		f.setVisible(true);
		f.setSize(500,500);
		
		Label l1 = new Label("One");
		Label l2 = new Label("Two");
		f.add(l1);
		f.add(l2);
		
		f.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent we){
			System.exit(0);
		  }
		});
	}
	
}
