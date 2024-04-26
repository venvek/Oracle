package Dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connectt {
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
			String sql = "" + "SELECT movie_id, title, location, screen " + 
						 " FROM movie ";
				
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setString(1, "범죄도시4");
			
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
}
}
