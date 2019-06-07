package com.lihl.observer;

public class ObserverA implements Observer {
	
	private int state;
	
	@Override
	public void update(Subject subject) {
		state = ((ConcreteSubject)subject).getState();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

}
