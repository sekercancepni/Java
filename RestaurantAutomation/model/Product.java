package ch.makery.address.model;

import java.sql.SQLException;
import ch.makery.address.model.Db;

public class Product {
    
	public int id;
	public String name;
	public double amount;
	
	public Product(int id, String name, double amount){
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setAmount(int newAmount){
		this.amount = newAmount;
	}
	
	//product save row sql statement
	public static void p_save(String name, double amount) {
		String sql = "INSERT INTO products(name, amount) VALUES('" + name + "', " + amount + " );";
		Db db = new Db();
		db.runAffectQuery(sql);
	}
	
	//product remove row sql statement
	public static void p_remove(String n){
		String sql = "DELETE FROM products WHERE name = '" + n + "';";
		Db db = new Db();
		db.runAffectQuery(sql);
	}
	
	
	
	
	
}
