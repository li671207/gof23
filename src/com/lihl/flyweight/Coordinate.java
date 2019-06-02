package com.lihl.flyweight;


/**
 * UnsharedConcreteFlyWeight非共享享元类
 * @author lihl
 *
 */
public class Coordinate {

	private String x, y;
	
	public Coordinate() {
	}

	public Coordinate(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	
}
