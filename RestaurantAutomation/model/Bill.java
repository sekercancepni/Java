package ch.makery.address.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bill {
	public boolean is_paid;
	public int created_at;
	public int total_amount;
	
	//Bill class constructor
	public Bill(int created_at,int total_amount){
		this.created_at = created_at;
		this.total_amount = total_amount;
		this.is_paid = false;
	}
	
	public void get_bill_products() throws SQLException{
		Connection connect = null;
		Statement statement = null;
		ResultSet resultSet = null;
		connect = DriverManager.getConnection("jdbc:sqlserver://localhost:23565;databasename=RestaurantAutomation;user=Restaurant;password=Restaurant");
		statement = connect.createStatement();
		statement.execute("select * from Bill_Product");
	}
	
	public int get_total_amount(){
		return 0;
	}
	
	public void set_as_paid(){
		this.is_paid = true;
	}
}
