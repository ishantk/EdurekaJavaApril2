package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import co.edureka.model.Student;

public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	
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
	
	public int insertStudent(Student sRef){
		
		int i = 0;
		
		try {
			
			//3. Write SQL Statement
			String sql = "insert into Student values(null,'"+sRef.name+"',"+sRef.age+",'"+sRef.email+"','"+sRef.address+"')";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			i = stmt.executeUpdate(sql);
			
			System.out.println("*****Record Inserted: "+i+"*****");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public int deleteStudent(int roll){
		
		int i = 0;
		
		try {
			
			//3. Write SQL Statement
			String sql = "delete from Student where roll = "+roll;
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			i = stmt.executeUpdate(sql);
			
			System.out.println("*****Record Deleted "+i+"*****");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public int updateStudent(Student sRef){
		
		int i = 0;
		
		try {
			
			//3. Write SQL Statement
			String sql = "update Student set name = '"+sRef.name+"', age = '"+sRef.age+"' where roll = "+sRef.roll;
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			i = stmt.executeUpdate(sql);
			
			System.out.println("*****Record Updated "+i+"*****");
			
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
