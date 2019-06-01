package com.lihl.singleton;

public class Hungry {
	public static final Hungry instace = new Hungry();
	
	private Hungry() {
	}
	
	public static Hungry getInstance() {
		return instace;
	}

}
