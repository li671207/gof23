package com.lihl.strategy;

public class NewCustomerManeyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {

		return standardPrice * 0.9;
	}

}
