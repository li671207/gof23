package com.lihl.facade;

public interface AIC {

	void nameCheck();

}

class MyAIC implements AIC {

	@Override
	public void nameCheck() {
		System.out.println("MyAIC.nameCheck()");
	}

}
