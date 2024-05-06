package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection connectDb() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://locahost:3306/webdb", "root", "1234");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
