package com.lihl.builder;

public class Client {

	public static void main(String[] args) {
		AirshipDirector airshipDirector = new MyAirshipDirector(new MyAirshipBuilder());
		
		Airship airShip = airshipDirector.directAirShip();
		
		System.out.println(airShip.getEngine().getName());
		airShip.launch();
		
	}

}
