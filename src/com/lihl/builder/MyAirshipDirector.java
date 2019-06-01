package com.lihl.builder;

public class MyAirshipDirector implements AirshipDirector {
	
	private AirshipBuilder builder;
	
	public MyAirshipDirector(AirshipBuilder builder) {
		this.builder = builder;
	}

	
	@Override
	public Airship directAirShip() {
		Engine engine = builder.builderEngine();
		EscapeTower escapeTower = builder.builderEscapeTower();
		OrbitalModule orbitalModule = builder.builderOrbitaModule();
		
		Airship airship = new Airship();
		airship.setEngine(engine);
		airship.setEscapeTower(escapeTower);
		airship.setOrbitalModule(orbitalModule);
		
		return airship;
	}

}
