package co.edureka.model;

import java.util.List;

public class Person {
	
	String name;
	String email;
	int age;
	
	Address address; // HAS-A Relation
	List<String> certificates; // HAS-A Relation and we got Collection
	

	public Person(){
		
	}
	
	// Resolve Dependency with LOW Coupling using Constructor
	public Person(Address address) {
		System.out.println("** DI with Constructor **");
		this.address = address;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	// Resolve Dependency with LOW Coupling using Setter
	public void setAddress(Address address) {
		System.out.println("** DI with Setter **");
		this.address = address;
	}
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
