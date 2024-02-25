package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractical {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CourseDAO dao = new CourseDAO();
		Course c = dao.getCourse(105);
		System.out.println("Course name is : "+c.courseName);
	}
}
	class CourseDAO{
		public Course getCourse(int id) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "1234");
			Statement st = con.createStatement();
			
			String query = "select course_name from course where student_id = "+id;
			ResultSet rs = st.executeQuery(query);
			rs.next();
			
			String courseName = rs.getString(1);
			Course c = new Course();
			c.courseName = courseName;
			c.studentId = id;
			return c;
		}
	}
	
	class Course{
		String courseName;
		int studentId;
	}

