package com.lihl.bridge;

public interface Brand {
	
	void sale();

}

class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("Dell.sale()");
	}

}

class Lenove implements Brand {

	@Override
	public void sale() {
		System.out.println("Lenove.sale()");
	}

}
