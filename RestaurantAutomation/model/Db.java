package ch.makery.address.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;

public class Db {
	public Connection conn = null;
	
	public Connection getConnection() throws SQLException {
		if (this.conn == null) {
			this.conn = DriverManager.getConnection("jdbc:sqlserver://localhost:23565;databasename=RestaurantAutomation;user=Restaurant;password=Restaurant");
		}
		return this.conn;
	}
	
	//sql statement
	public void runAffectQuery(String sql) {
		try {
			Statement statement = this.getConnection().createStatement();
			statement.executeUpdate(sql);
		} catch(SQLException a) {
			Util.alertError("Database Error", "Occured unknonwn error. please try again");
		}
	}
}
