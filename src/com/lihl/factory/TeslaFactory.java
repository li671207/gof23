package com.lihl.factory;

public class TeslaFactory implements FactoryMethod {

	@Override
	public Car createCar() {
		return new Tesla();
	}

}
