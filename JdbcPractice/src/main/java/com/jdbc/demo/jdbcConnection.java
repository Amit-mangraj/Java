package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.err.println("1");
		Class.forName("com.mysql.cj.jdbc.Driver"); // driver register to the current class
		System.out.println("2");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin"); // establish
																													// connection
		// when we want to execute a statement only once the we use statement
		Statement st;
		// st = con.createStatement(); //create statement
		ResultSet rs;
		// rs = st.executeQuery("select * from amit"); //return type of execute query is
		// resultset and executeupdate is integer

		// when we want to execute a statement many time then we use prepared statement
		// PreparedStatement ps = con.prepareStatement("insert into amit(id,ename,dgn)
		// values(40015562,\"Amit Kumar\",\"Engineer\");");
		PreparedStatement ps = con.prepareStatement("update amit set ename = \"kaustav\" where id= 40015561");
		ps = con.prepareStatement("delete from amit where id= 40015562");
		ps.executeUpdate();// used for

		// can also wirte like this
		rs = con.createStatement().executeQuery("select * from amit");
		int id;
		String name;
		String designation;

		while (rs.next()) {
			id = rs.getInt(1);
			name = rs.getString(2);
			designation = rs.getString(3);
			System.out.println("id" + " " + id + " " + "name" + " " + name + " " + "designation" + " " + designation);
		}

	}

}
