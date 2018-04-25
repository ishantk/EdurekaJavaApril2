package co.edureka.model;

public class Employee {
	
	int eid;
	String name;
	String email;
	String password;
	String dept;
	int floor;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	// Business Method
	public void showEmployee(String managerName, String technology){
		
		if(email.equals("john@example.com")){
			System.out.println(name+" reports to "+managerName);
			System.out.println(name+" works in "+technology+" in "+dept+" department on "+floor+" floor");
		}else{
			System.out.println("Invalid Email !!");
		}
		
	}
}
