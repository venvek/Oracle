package Dbconnect;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Test {
		public static void main(String[] ar){
			Frame frame=new Frame("Reakwon");
			
			frame.setSize(500,300);
			frame.setLayout(new BorderLayout());
			Button eastButton=new Button("East");
			Button westButton=new Button("West");
			Button southButton=new Button("South");
			Button northButton=new Button("North");
			Button centerButton=new Button("Center");
			
			frame.add("East",westButton);
			frame.add("West",eastButton);
			frame.add("South",southButton);
			frame.add("North",northButton);
			frame.add("Center",centerButton);
			
			frame.setVisible(true);
		}
	}