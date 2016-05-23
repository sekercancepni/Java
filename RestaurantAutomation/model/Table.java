package ch.makery.address.model;

public class Table {
	public int id;
	public String name;
	public static String description;
	public boolean is_available;
	
	public Table(int id,String name,String description){
		this.id = id;
		this.name = name;
		this.description = description;
		this.is_available = true;
	}
	
	public boolean is_available(){
		return is_available;
	}
	
	//tables save row sql statement
	public static void t_save(String name, String description) {
		String sql = "INSERT INTO tables(name,descr) VALUES('" + name + "', '" + description + "' );";
		Db db = new Db();
		db.runAffectQuery(sql);
	}
	
	//tables remove row sql statement
	public static void t_remove(String n){
		String sql = "DELETE FROM tables WHERE name = '" + n + "';";
		Db db = new Db();
		db.runAffectQuery(sql);
	}
}

