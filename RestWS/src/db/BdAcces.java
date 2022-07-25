package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BdAcces{
	
	public Connection connectToDB() {
		//Chargement du driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {}
		
		//CONNECTION A LA BASE
		Connection connexion =null;
		try {
			connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/news","userTest","Passer_123");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connexion;

	}
}