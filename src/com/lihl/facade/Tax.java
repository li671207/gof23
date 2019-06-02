package com.lihl.facade;

public interface Tax {
	
	void taxCheck();

}

class MyTax implements Tax {

	@Override
	public void taxCheck() {
		System.out.println("MyTax.taxCheck()");
	}
	
}
