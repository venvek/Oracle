package Dbconnect;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Testi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Button btn1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestW frame = new TestW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Testi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 176, 176));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Logo");
		lblNewLabel.setFont(new Font("휴먼굵은샘체", Font.PLAIN, 70));
		lblNewLabel.setBounds(516, 21, 175, 71);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("뒤로가기");
		/*
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } if(e.getActionCommand().equals("JButton"))
		 * });
		 */
		btnNewButton.setBounds(977, 553, 97, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("티켓취소하기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(1086, 552, 121, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("상세 내역");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel_1.setBounds(497, 90, 167, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("예매 번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(793, 131, 148, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("영 화 명");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(64, 234, 148, 71);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("극 장 명");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(60, 312, 123, 62);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("상영 일시");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(60, 372, 148, 62);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("352245");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(995, 135, 148, 48);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("범죄도시 4");
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(990, 247, 175, 44);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CGV 의정부");
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(990, 306, 189, 48);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("24년 4월 00:00");
		lblNewLabel_9.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_9.setBounds(977, 372, 230, 48);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_1_1 = new JLabel("포스터 사진");
		lblNewLabel_1_1.setBackground(new Color(255, 255, 128));
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_1_1.setBounds(170, 130, 230, 113);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_10 = new JLabel("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		lblNewLabel_10.setBounds(0, 290, 1264, 15);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_5_1 = new JLabel("상영관");
		lblNewLabel_5_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_5_1.setBounds(60, 425, 148, 62);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("관람수");
		lblNewLabel_5_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_5_2.setBounds(64, 483, 148, 62);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_9_1 = new JLabel("1관");
		lblNewLabel_9_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_9_1.setBounds(977, 430, 230, 48);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("2명");
		lblNewLabel_9_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_9_2.setBounds(977, 490, 230, 48);
		contentPane.add(lblNewLabel_9_2);
	}
}

//public void startFrame() {
