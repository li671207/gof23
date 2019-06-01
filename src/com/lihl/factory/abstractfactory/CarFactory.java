package com.lihl.factory.abstractfactory;

public interface CarFactory {
	
	Engine createEngine();
	
	Seat createSeat();
	
	Tyre createTyre();

}
