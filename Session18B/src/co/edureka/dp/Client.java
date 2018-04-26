package co.edureka.dp;

public class Client {

	public static void main(String[] args) {
		
		/*Connection c1 = new Connection();
		Connection c2 = new Connection();
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		/*Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();

		System.out.println(c1);
		System.out.println(c2);*/
		
		//Plan plan = PlanFactory.getPlan(4);
		//plan.showPlan();
		
		State s1 = new InitialState();
		State s2 = new FinalState();
		
		Context cxt = new Context();
		cxt.setState(s1);
		
		System.out.println("State of Context is: "+cxt.getState());
		
		cxt.setState(s2);
		System.out.println("State of Context is: "+cxt.getState());
	}

}
