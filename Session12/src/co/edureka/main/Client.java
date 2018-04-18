package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class Client {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 0;
		s1.name = "Jack";
		s1.age = 37;
		s1.email = "jack@example.com";
		s1.address = "Clover Heights";
		
		System.out.println(s1);
		
		// Driver Loaded
		JDBCHelper helper = new JDBCHelper();

		// Connection Creation
		helper.openConnection();
		
		
		// Insert the data
		//int i = helper.insertStudent(s1);
		//if(i>0){
		//	System.out.println("Record Inserted "+i);
		//}//else{
		//	System.out.println("Record Not Inserted "+i);
		//}
		
		// Update the data
		//helper.updateStudent(s1);
		
		// delete
		//helper.deleteStudent(6);
		
		/*ArrayList<Student> list = helper.queryStudents();
		
		for(Student s : list){
			System.out.println(s);
		}*/
		
		//helper.executeProcedure(s1);
		helper.executeBacth();
		
		// Close the Connection
		helper.closeConnection();
		
	}

}
