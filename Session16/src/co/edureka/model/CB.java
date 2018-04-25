package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	CA ca; // HAS-A Relation

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		System.out.println("==DI With Setter using Autowiring Annotation==");
		this.ca = ca;
	}
	
}
