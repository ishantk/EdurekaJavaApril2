class Cab{
	
	// Attributes | Non Static -> Property of Object
	String driverName;
	String regNum;
	String color;
	int seatingCap;

	// Non Static -> Property of Object and is executed when the object is created
	Cab(){
		driverName = "NA";
		regNum = "NA";
		color = "White";
		seatingCap = 5;
		System.out.println("Cab Object Constructed");
	}
	
	// Non Static -> Property of Object
	void showCabDetails(){
		System.out.println(driverName+" has a "+color+" cab with registration number "+regNum+". "+seatingCap+" persons can be seated");
	}
	
}

class LuxuryCab extends Cab{ // No Code Redundancy 
	
	LuxuryCab() {
		regNum = "ABC1020XYZ";
		//...
		System.out.println("LuxuryCab Object Constructed");
	}
	
}


public class Inheritance {

	public static void main(String[] args) {
		
		//Cab cRef = new Cab();
		//cRef.showCabDetails();
		
		LuxuryCab lRef = new LuxuryCab();
		lRef.driverName = "John";
		lRef.seatingCap = 7;
		lRef.color = "Black";
		lRef.showCabDetails();		
		
		
	}

}
