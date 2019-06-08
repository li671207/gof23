package com.lihl.state;

public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("CheckedInState.handle()");
	}

}
