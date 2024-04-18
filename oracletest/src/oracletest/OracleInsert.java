package oracletest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleInsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();
			
			String sql4 = "SELECT MAX(deptno) FROM DEPT";
			ResultSet rs = stmt.executeQuery(sql4);
			rs.next();
				System.out.print(rs.getString("max(deptno)");
				
			String ldeptno = "60", ldname = "car", lsloc = "incheon";
			String sql3 = "INSERT INTO dept VALUES ("	+ ldeptno + "','" + ldname + "','" + lsloc + "')";	
					boolean a = stmt.execute(sql3);
					if (!a) {
						System.out.println("Insert success.\n");
					} else {
						System.out.println("Insert fail.\n");
					}		
			
			String ideptno = "50", sdname = "IT", sloc = "SEOUL";
			String sql = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
			//String sql 3 = "where comm is null";
			boolean b = stmt.execute(sql);
			
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
			String sql2 = "SELECT deptno, dname, loc FROM dept";
			ResultSet rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc") + " ");
			}
			}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
}
	}
}
