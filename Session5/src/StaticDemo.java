
class Student{
	
	// Attributes
	
	// Object's Property | Every Object will have its own copy of attribute
	int roll;
	String name;
	
	// Class Property |  One Class will have only one schoolName Attribute
	static String schoolName; 
	
	// Methods
	
	// Object's Property can access the property of class
	void showStudent(){
		System.out.println(roll+" belongs to "+name+" and studies in "+schoolName);
	}
	
	// Class Property cannot access the property of object
	static void showSchool(){
		System.out.println("School is: "+schoolName);
		//System.out.println("School is: "+schoolName+" Roll: "+roll);
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Student sRef1 = new Student();
		Student sRef2 = new Student();
		
		System.out.println("sRef1 is: "+sRef1);
		System.out.println("sRef2 is: "+sRef2);
		
		// Write the data in Object
		sRef1.roll = 101;
		sRef1.name = "John";
		
		sRef2.roll = 102;
		sRef2.name = "Jennie";
		
		
		// Write the data in Class
		Student.schoolName = "ABC International";
		
		sRef1.schoolName = "XYZ National"; // objects can access the property of class.
		sRef2.schoolName = "XXXYYYZZZ";
		
		sRef1.showStudent();
		sRef2.showStudent();
		
		Student.showSchool();

	}

}
