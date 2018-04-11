package co.edureka.packone;

/*
 * private
 * default (dont write anything)
 * protected
 * public
 */

public class One { // public access
	
	public static final double PI = 3.14;
	
	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

class Two{ // default access
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

/*class Five{
	
}*/

/*public class Six{ -> if class is public, source file should be saved with the same name
	
}*/

/*private class Three{
	
}

protected class Four{
	
}*/
