package co.edureka.dp;

interface State {

}

class InitialState implements State{
	public String toString() {
		return "Initial State";
	}
}

class FinalState implements State{
	public String toString() {
		return "Final State";
	}
}

class Context{
	
	State state;
	
	void setState(State s){
		state = s;
	}
	
	State getState(){
		return state;
	}
	
}
