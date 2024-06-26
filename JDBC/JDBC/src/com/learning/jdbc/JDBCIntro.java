package com.learning.jdbc;

import java.sql.*;
public class JDBCIntro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "1234");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from course");
		while(rs.next())
			System.out.println(rs.getInt(1)+"..."+rs.getString(2));
		
//		int stuId = 110;
//		String subject = "Geography";
//		String query = "insert into course values(" + stuId + ",'" + subject + "')";
//		int noOfRowsAffected = st.executeUpdate("insert into course values (104, 'Statistics')");
//		int noOfRowsAffected = st.executeUpdate(query);
//		if(noOfRowsAffected!=0) System.out.println("New row added");
//		else System.out.println("Error adding a row");
		
//		String query = "insert into course values (?,?)";
//		PreparedStatement pst = con.prepareStatement(query);
//		pst.setInt(1, 112);
//		pst.setString(2,  "History");
//		pst.executeUpdate();
		st.close();
		con.close();
	}
}
