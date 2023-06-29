package app.javapandit.java1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBC_BasicExample {

	static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=JDBCtestJava1";
	static final String USER = "java1";
	static final String PASS = "javaJDBCtest";
	static final String QUERY = "SELECT Id, FirstName, LastName, Age, Active FROM Person";

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Open JDBC Connection
			con = DriverManager.getConnection(DB_URL, USER, PASS);

			// Create Statement Object to Execute Query
			stmt = con.createStatement();

			// Pass String Query & Execute to fetch Result Set Object
			rs = stmt.executeQuery(QUERY);

			// Loop through Result Set
			while (rs.next()) {
				// Retrieve by Column Name
				String printRow = "ID: " + rs.getInt("Id");
				printRow += ", FirstName: " + rs.getString("FirstName");
				printRow += ", LastName: " + rs.getString("LastName");
				printRow += ", Age: " + rs.getInt("Age");
				printRow += ", Active: " + rs.getBoolean("Active");
				System.out.println(printRow);

			}
		} catch (SQLException sqlEx) {
			System.out.println("DB Query Failed: " + sqlEx.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			}

		}
	}

}
