package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Machine {
	
	private List<State> states = new ArrayList<State>(); 
	private List<String> integers = new ArrayList<String>(); 
	private State initialState; 
	
	public Machine (Collection<State> states, State initialState) {
		super(); 
		this.states.addAll(states);
		this.initialState = initialState; 
	}
	
	public List<String> getIntegers() {
		return integers; 
	}

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states; 
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getState(String string) {
		// TODO Auto-generated method stub
		
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state; 
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return integers.size(); 
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		for (String i : integers) {
			if (string.equals(i)) {
			return true; 
			}
		}
		return false; 
	}

}
