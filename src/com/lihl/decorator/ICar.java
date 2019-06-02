package com.lihl.decorator;

//Component
public interface ICar {
	
	void move();

}

//ConcreteComponent 具体构件角色(真实对象)
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("Car.move()");
	}
	
}

//Decorator装饰角色
class SuperCar extends Car {
	protected ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
	
}

//ConcreteDecorator具体装饰角色
class FlyCar extends SuperCar{
	
	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly() {
		System.out.println("FlyCar.fly()");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	
}

class SwimCar extends SuperCar {

	public SwimCar(ICar car) {
		super(car);
	}
	
	public void swim() {
		System.out.println("SwimCar.swim()");
	}

	@Override
	public void move() {
		super.move();
		swim();
	}
	
}

class AiCar extends SuperCar {

	public AiCar(ICar car) {
		super(car);
	}
	
	public void ai() {
		System.out.println("AiCar.Ai()");
	}
	
	@Override
	public void move() {
		super.move();
		ai();
	}
	
}
