package com.lihl.factory;

public class AudiFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new Audi();
	}

}
