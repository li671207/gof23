package com.lihl.factory.abstractfactory;

public interface Tyre {
	
	void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("LuxuryTyre.revolve()");
	}
	
}

class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("LowTyre.revolve()");
	}
	
}

