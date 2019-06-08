package com.lihl.state;

public class Context {
	
	private State state;
	
	public void setState(State state) {
		this.state = state;
		this.state.handle();
	}

}
