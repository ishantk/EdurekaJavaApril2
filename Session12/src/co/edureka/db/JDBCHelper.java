package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import co.edureka.model.Student;

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
	
	public int insertStudent(Student sRef){
		
		int i = 0;
		
		try {
			
			//3. Write SQL Statement
			//String sql = "insert into Student values(null,'"+sRef.name+"',"+sRef.age+",'"+sRef.email+"','"+sRef.address+"')";
			String sql = "insert into Student values(null,?,?,?,?)"; // ? - Wild Card
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//i = stmt.executeUpdate(sql);
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setString(3, sRef.email);
			pStmt.setString(4, sRef.address);
			
			
			i = pStmt.executeUpdate();
			
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
	
	public ArrayList<Student> queryStudents(){
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		try {
			
			//3. Write SQL Statement
			String sql = "select * from Student";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next()){
				
				Student stu = new Student();
				
				stu.roll = rs.getInt(1);
				stu.name = rs.getString(2);
				stu.age = rs.getInt(3);
				stu.email = rs.getString(4);
				stu.address = rs.getString(5);
				
				//System.out.println(stu);
				//System.out.println("---------------------------------------------");
				
				stuList.add(stu);
			}

			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return stuList;
	}
	
	
	public void executeProcedure(Student sRef){
		
		try {
			
			String sql = "{ call addStudent(?,?,?,?) }";
			
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, sRef.name);
			cStmt.setInt(2, sRef.age);
			cStmt.setString(3, sRef.email);
			cStmt.setString(4, sRef.address);
			
			cStmt.execute();
			
			System.out.println("*****Procedure Executed*****");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void executeBacth(){
		
		try {
			
			//3. Write SQL Statement
			String sql1 = "update Student set name = 'Mike M', age = 39 where roll = 8";
			//String sql2 = "delete from Student where roll = 5"; // throw an exception
			String sql2 = "update Student set name = 'Leo L', age = 34 where roll = 3";
			
			//4. Execute SQL Statement
			stmt = con.createStatement();
			
			// Batch Processing
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			con.setAutoCommit(false);
			
			stmt.executeBatch();
			
			con.commit(); // Committing the batch as a transaction (ATOMICITY)
			
			System.out.println("*****Batch Executed*****");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			
			try {
				con.rollback();
				System.out.println("*****State RollBacked*****");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
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
