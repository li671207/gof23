package com.lihl.facade;

public interface Bank {
	
	void openAcct();

}

class MyBank implements Bank {

	@Override
	public void openAcct() {
		System.out.println("MyBank.openAcct()");
	}
	
}
