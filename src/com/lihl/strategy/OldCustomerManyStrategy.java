package com.lihl.strategy;

public class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {

		return standardPrice * 0.8;
	}

}
