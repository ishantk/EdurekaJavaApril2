package co.edureka.model;

public class Customer {
	
	// attributes
	Integer id;
	String name;
	String email;
	String address;
	Integer age;
	
	public Customer(){
		
	}
	
	public Customer(Integer id, String name, String email, String address, Integer age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", age=" + age
				+ "]";
	}
	
}
