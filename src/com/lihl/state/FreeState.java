package com.lihl.state;

public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("FreeState.handle()");
	}

}
