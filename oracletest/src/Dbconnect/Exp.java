package Dbconnect;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Exp {
	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private Label lb1, ticketnum, movie, screenhall, starttime;
	
	public Exp() {
		f = new Frame("CINEMA");
		ok = new Button("ok");
		cancel = new Button("delete");
		lb1 = new Label("LOGO");
		ticketnum = new Label("예매 번호");
		movie = new Label("영화명");
		screenhall = new Label("극장명");
		starttime = new Label("상영일시");
		p = new Panel();
		
	}

	public void startFrame() {
		f.add("North",lb1);
		p.setBackground(Color.white);
		p.add("West",ticketnum);
		p.add(movie);
		p.add(screenhall);
		p.add(starttime);
		p.add("South",ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);

		f.setSize(1280, 800);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp g = new Exp();
		g.startFrame();
	}
}


