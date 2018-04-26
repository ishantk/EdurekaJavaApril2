package co.edureka.dp;

// SingleTon as a Design Pattern
public class Connection {

	private static Connection con = new Connection();
	
	private Connection() {
		System.out.println("==Connection Object Constructed==");
	}
	
	public static Connection getConnection(){
		return con;
	}
}
