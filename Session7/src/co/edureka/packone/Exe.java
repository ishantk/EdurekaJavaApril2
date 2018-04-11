package co.edureka.packone;

public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		//o.pvtShow(); // error -> private cannot be accessed outside the boundary
		o.defShow();
		o.protShow();
		o.pubShow();
		
		System.out.println("**************");
		
		Two t = new Two();
		//t.pvtShow(); // error -> private cannot be accessed outside the boundary
		t.defShow();
		t.protShow();
		t.pubShow();

	}

}
