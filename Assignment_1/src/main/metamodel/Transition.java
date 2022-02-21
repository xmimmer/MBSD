package main.metamodel;

public class Transition {
	

	private String event; 
	private State to; 

	public Transition(String event, State to) {
		super(); 
		this.event = event; 
		this.to = to; 
	}
	
	
	public Object getEvent() {
		// TODO Auto-generated method stub
		return event;
	}

	public State getTarget() {
		// TODO Auto-generated method stub
		return to;
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		return true; 
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
	    System.out.print(this.getEvent().toString());
		return null;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
