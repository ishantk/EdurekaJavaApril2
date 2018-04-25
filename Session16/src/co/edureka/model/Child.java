package co.edureka.model;

public class Child extends Father{
	
	int vehicles;

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Child [fname=" + fname + ", lname=" + lname + ", money=" + money +", vehicles=" + vehicles + "]";
	}
	
}
