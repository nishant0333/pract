package jtc.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	private static Connection connection = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nishant");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
