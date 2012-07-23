package src.states;
public class State {
	State state=null;
	
	void setState(State nState){
		state=nState;
	}
	
	State getState(){
		return state;
	}
}
