package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	// Attributes
	
	@Id @GeneratedValue
	@Column(name="PID")
	Integer id;
	
	@Column(name="PNAME")
	String name;
	
	@Column(name="PRICE")
	Integer price;
	
	@Column(name="BRAND")
	String brand;

	public Product(){
		
	}
	
	public Product(Integer id, String name, Integer price, String brand) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
}
