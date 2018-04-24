package co.edureka.model;

public class Employee {
	
	Integer eid;
	String name;
	Integer salary;
	
	public Employee(){
		
	}
	
	public Employee(Integer eid, String name, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
