package Dbconnect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TestW extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	public TestW() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(977, 553, 97, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("상세정보");
		btnNewButton_1.setBounds(1097, 552, 97, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("예매 내역");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(501, 104, 167, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("예매 번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(55, 158, 148, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("영 화 명");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(55, 225, 148, 79);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("극 장 명");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(55, 302, 123, 62);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("상영 일시");
		lblNewLabel_5.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(55, 391, 148, 62);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("352245");
		lblNewLabel_6.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(966, 162, 148, 48);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("범죄도시 4");
		lblNewLabel_7.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(966, 230, 175, 44);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CGV 의정부");
		lblNewLabel_8.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(966, 309, 189, 48);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("24년 4월 00:00");
		lblNewLabel_9.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_9.setBounds(967, 398, 230, 48);
		contentPane.add(lblNewLabel_9);
	}
}
