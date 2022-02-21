package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine machine; 
	private State currentState; 
	
	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.machine = m; 
		currentState = m.getInitialState(); 
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return currentState;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		for (Transition t : currentState.getTransitions()) {
			if (t.getEvent().equals(string)) {
				currentState = t.getTarget(); 
				return;
			}
			
		}
		
		System.err.println("Unhandled event " + string);
		
	}
	
	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
