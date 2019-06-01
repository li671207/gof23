package com.lihl.factory.abstractfactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("LuxurySeat.massage()");
	}
	
}

class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("LowSeat.massage()");
	}
	
}

