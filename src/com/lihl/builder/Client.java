package com.lihl.builder;

/**
 * – 分离了对象子组件的单独构造(由Builder来负责)和装配(由Director负责)。 从而可以构
造出复杂的对象。这个模式适用于：某个对象的构建过程复杂的情况下使用。
– 由于实现了构建和装配的解耦。不同的构建器，相同的装配，也可以做出不同的对象；
相同的构建器，不同的装配顺序也可以做出不同的对象。也就是实现了构建算法、装配
算法的解耦，实现了更好的复用。
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		AirshipDirector airshipDirector = new MyAirshipDirector(new MyAirshipBuilder());
		
		Airship airShip = airshipDirector.directAirShip();
		
		System.out.println(airShip.getEngine().getName());
		airShip.launch();
		
	}

}
