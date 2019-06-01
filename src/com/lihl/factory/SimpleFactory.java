package com.lihl.factory;

public class SimpleFactory {
	
	public static Car getCar(String car) {
		switch (car) {
		case "Tesla":
			return new Tesla();
		case "Audi":
			return new Audi();
		default:
			return null;
		}
	}
	
	public static Car createTesla() {
		return new Tesla();
	}
	
	public static Car createAudi() {
		return new Audi();
	}

}
