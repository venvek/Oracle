package Dbconnect;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class imget extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public imget() {
		
		JLabel imgLabel = new JLabel();
		ImageIcon ic1 = new ImageIcon(
		Movi.class.getResource("/Dbconnect/bin/poster.jpg")
		);
		
		imgLabel.setIcon(ic1);
		
		imgLabel.setBounds(210, 30, 165, 150);
		imgLabel.setHorizontalAlignment(JLabel.CENTER);
		
		getRootPane().add(imgLabel);
	
		this.setVisible(true);
	}
}
	