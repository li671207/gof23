package com.lihl.strategy;

public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {

		return standardPrice;
	}

}
