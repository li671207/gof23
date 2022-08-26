package com.lihl.builder;

public class MyAirshipBuilder implements AirshipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("MyAirshipBuilder.builderEngine()");
		return new Engine("我的发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("MyAirshipBuilder.builderOrbitalModule()");
		return new OrbitalModule("我的轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("MyAirshipBuilder.builderEscapeTower()");
		return new EscapeTower("我的逃逸塔");
	}

}
