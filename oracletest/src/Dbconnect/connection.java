package Dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn= DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##green",
					"green1234"				
					);
			String sql = "" + "INSERT INTO users (userid, username, userpassword, movie, cim) "
					+ "VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString((1, "jinsung");
			pstmt.setString((2, "jintjd");
			pstmt.setString((3, "1234");
			pstmt.setString((4, "jinsung");
			pstmt.setString(5, "")
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			try {
				conn.close();
				System.out.println(" ");
			} catch (SQLException e) {}
			}
		
	}
}
