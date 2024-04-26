package Dbconnect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Movie extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;	
	/**
	 * Create the panel.
	 */
	public Movie(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##green",
					"green1234"				
					);
			String sql = "" + " SELECT movie_id, title, location, screen " + 
						 " FROM movie " + " WHERE title =? ";
				
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "범죄도시4");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Movi movi = new Movi();
				movi.setMovie_id(rs.getString("movie_id"));
				movi.setTitle(rs.getString("title"));
				movi.setLocation(rs.getString("location"));
				movi.setScreen(rs.getInt("screen"));
				
				System.out.println(movi);
			}
			pstmt.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			if(conn !=null) {
			try {
				conn.close();
			} catch (SQLException e) {}
			}
	}
		
		ImageIcon ic1 = new ImageIcon(
		Movie.class.getResource("/projectPackage/bin/poster.jpg")
		);
		setLayout(null);
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(Color.white);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 351);
		add(panel);
		panel.setLayout(null);
		
		
		  String imagePath = getClass().getResource("poster.jpg").getPath();
		  System.out.println(imagePath);
		 
	      
		
		  JLabel show_image = new JLabel(""); show_image.setIcon(new
		  // ImageIcon("/poster3.jpg")); // show_image.setIcon(new
		  ImageIcon("C:\\Users\\Manic-063\\git\\project_00\\image\\poster3.jpg"));
		  show_image.setBounds(157, 57, 152, 234); panel.add(show_image);
		 
		
		JLabel lblNewLabel = new JLabel("CGVING");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 38));
		lblNewLabel.setBounds(361, 10, 254, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("상세 내역");
		lblNewLabel_1.setFont(new Font("HY산B", Font.BOLD, 28));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(383, 63, 143, 51);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("영화명");
		lblNewLabel_2.setFont(new Font("바탕", Font.BOLD, 22));
		lblNewLabel_2.setBounds(47, 351, 82, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("예매 번호");
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 28));
		lblNewLabel_3.setBounds(777, 146, 152, 51);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("영화명");
		lblNewLabel_2_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(34, 290, 111, 41);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("1234-567");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_4.setBounds(1010, 130, 184, 84);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("영화");
		lblNewLabel_2_1_2.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_2.setBounds(1010, 290, 119, 41);
		panel.add(lblNewLabel_2_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 355, 1280, 295);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("극장명");
		lblNewLabel_2_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(47, 61, 111, 41);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("상영일시");
		lblNewLabel_2_1_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_1.setBounds(47, 10, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("상영관");
		lblNewLabel_2_1_1_2.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_2.setBounds(47, 112, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("관람수");
		lblNewLabel_2_1_1_3.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_3.setBounds(47, 163, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_3);
		
		JButton btnNewButton = new JButton("뒤로가기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		btnNewButton.setBounds(940, 231, 111, 44);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("티켓 취소하기");
		btnNewButton_1.setBounds(1063, 231, 135, 44);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("00:00");
		lblNewLabel_2_1_1_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_1_1.setBounds(956, 10, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("CGV");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_1_1_1.setBounds(940, 61, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("0관");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(940, 112, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("0명");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("바탕", Font.BOLD, 25));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(940, 163, 111, 41);
		panel_1.add(lblNewLabel_2_1_1_1_1_1_1_1);

		this.setVisible(false);
	}
}
