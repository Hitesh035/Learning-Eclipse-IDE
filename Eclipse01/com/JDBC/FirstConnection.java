package com.JDBC;

import java.sql.*;

public class FirstConnection {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement stm = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trial1", "root", "password");

			stm = con.createStatement();

			ResultSet set = stm.executeQuery("select * from student where cgpa> 8.5");

			while (set.next()) {
				System.out.println(set.getInt("student_id") + " " + set.getString("name") + " "
						+ set.getString("discipline") + " " + set.getDouble("cgpa"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null && stm != null) {
				con.close();
				stm.close();
			}

		}

	}

}
