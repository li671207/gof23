package com.lihl.strategy;

public class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {

		return standardPrice * 0.85;
	}

}
