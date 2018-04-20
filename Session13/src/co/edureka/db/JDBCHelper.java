package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import co.edureka.model.User;

public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt; // For Stored Procedures
	
	public JDBCHelper() {
		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("*****Driver Loaded*****");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void openConnection(){
		try {
			
			//2. Open Connection
			String url = "jdbc:mysql://localhost/EdurekaApril2";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("*****Connection Opened*****");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public int registerUser(User uRef){
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null,?,?,?)"; // ? - Wild Card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public void closeConnection(){
		try {
			
			con.close();
			System.out.println("*****Connection Closed*****");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
