package inariSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
	private static final String ConnectionURL = "jdbc:sqlserver://localhost:1433;"
			+ "databaseName=InariDB;user=;password=;integratedSecurity=true;";

	public void conexao() {
		ResultSet rs;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		try {
			System.setProperty("jdbc.Drivers", driver);

			Connection con = DriverManager.getConnection(ConnectionURL);
			Statement stmt = con.createStatement();
			String plantasSQL = "SELECT * FROM dbo.Minerais";
			String selectDadosSQL = "SELECT Ferro,Magnesio,Nitrogenio,Enxofre,P2O5,K2O,Calcio,Boro,Cloro,Molibdenio,"
					+ "Cobre,Manganes,Zinco,Cobalto,Aluminio,Potassio,Fosforo FROM dbo.Minerais";

			rs = stmt.executeQuery(plantasSQL);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		

	}
}
