interface Plan{
	
	// Neither you nor RTE can create objects
	//error
	/*Plan(){
		System.out.println("Plan Object Constructed");
	}*/
	
	// Plan(); error
	
	void setPlanDetails(); 		// public void abstract setPlanDetails();
	void showPlanDetails();		// public void abstract showPlanDetails();
	
	// Error
	/*void fun(){
		System.out.println("This is fun");
	}*/
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	Plan2G(){
		System.out.println("Plan2G Object Constructed");
	}
	
	public void setPlanDetails(){
		data = 1;
		price = 200;
	}
	
	public void showPlanDetails(){
		System.out.println(data+"GB data in Plan2G is available for \u20b9"+price);
	}
	
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	Plan3G(){
		System.out.println("Plan3G Object Constructed");
	}
	
	public void setPlanDetails(){
		data = 2;
		price = 300;
	}
	
	public void showPlanDetails(){
		System.out.println(data+"GB data in Plan3G is available for \u20b9"+price);
	}
	
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	Plan4G(){
		System.out.println("Plan4G Object Constructed");
	}
	
	
	public void setPlanDetails(){
		data = 5;
		price = 500;
	}
	
	public void showPlanDetails(){
		System.out.println(data+"GB data in Plan4G is available for \u20b9"+price);
	}
	
}


public class InfDemo {

	public static void main(String[] args) {
		
		Plan plan;
		
		plan = new Plan2G();
		plan.setPlanDetails();
		plan.showPlanDetails();
		
		System.out.println("***********************************");
		
		plan = new Plan3G(); 
		plan.setPlanDetails();
		plan.showPlanDetails();
		
		System.out.println("***********************************");
		
		plan = new Plan4G(); 
		plan.setPlanDetails();
		plan.showPlanDetails();
		

	}

}
