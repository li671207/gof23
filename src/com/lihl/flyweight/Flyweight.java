package com.lihl.flyweight;


/**
 * FlyWeight抽象享元类
 * @author lihl
 *
 */
public interface Flyweight {
	
	String getColor();
	void setColor(String color);
	void display(Coordinate coordinate);

}

/**
 * ConcreteFlyWeight具体享元类
 * @author lihl
 *
 */
class ChessFlyweight implements Flyweight {
	
	private String color;
	
	public ChessFlyweight() {
	}

	public ChessFlyweight(String color) {
		super();
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
		
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("颜色："+color);
		System.out.println("坐标：("+coordinate.getX()+", "+coordinate.getY()+")");
	}
	
}
