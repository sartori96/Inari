package inariSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
// Create a variable for the connection string.
	String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=InariDB";

	// Declare the JDBC objects.
	final String user = "Rodrigo";
	final String password = "19111995";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	public Connection conexao() {

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl, user, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public ResultSet retornoDB() {
		// Create and execute an SQL statement that returns some data.
		String SQL = "select * from Minerais";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			/*
			 * while (rs.next()) { System.out.println(rs.getObject("Name_Plant") + " " +
			 * rs.getObject("Ferro")); }
			 */
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;

	}

	public void CloseDB() {

		if (rs != null)
			try {
				rs.close();
			} catch (Exception e) {
			}
		if (stmt != null)
			try {
				stmt.close();
			} catch (Exception e) {
			}
		if (con != null)
			try {
				con.close();
			} catch (Exception e) {
			}

	}
}
