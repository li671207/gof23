package com.lihl.strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void printPrince(double prince) {
		System.out.println(strategy.getPrice(prince));
	}

}
