package logintest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrmaeVo {
			private Frame f;
			private TextField id;
			private TextField pwd;
			private TextField sl;
			private Button btn;
			
			public LoginFrmaeVo() {
			Frame f = new Frame("Login");
			f.setSize(400,200);
			f.setLayout(null);
			
			Label lid = new Label("ID");
			lid.setLocation(20,40);
			lid.setSize(50, 50);
			Label lpwd = new Label("PWD");
			lpwd.setLocation(20,80); 
			lpwd.setSize(50, 50);
			
			Button b = new Button("»Æ¿Œ");
			b.setSize(100, 50);
			b.setLocation(100, 75);
			
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					f.setTitle("jintjd");
				}
			});
			f.add(b);
			f.setVisible(true);
			
			}
}
