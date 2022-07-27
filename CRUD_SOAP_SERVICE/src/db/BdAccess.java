package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdAccess {

	public Connection connectToDB() {
		// Chargement du driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}

		// CONNECTION A LA BASE
		Connection connexion = null;
		try {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudservices", "username", "password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connexion;

	}
}