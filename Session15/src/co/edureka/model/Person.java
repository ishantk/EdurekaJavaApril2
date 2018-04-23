package co.edureka.model;

import java.util.List;

public class Person {
	
	Integer pid;
	String name;
	String email;
	String age;
	
	Address adrs; 				// One to One Relationship (HAS-A Relation)
	List<Address> addresses;    // One to Many Relationship (HAS-A Relation)

}
