package com.lihl.factory.abstractfactory;

public interface Engine {
	
	void star();
	void run();
}

class LuxuryEngine implements Engine{

	@Override
	public void star() {
		System.out.println("LuxuryEngine.star()");
	}

	@Override
	public void run() {
		System.out.println("LuxuryEngine.run()");
	}
	
}

class LowEngine implements Engine{

	@Override
	public void star() {
		System.out.println("LowEngine.star()");
	}

	@Override
	public void run() {
		System.out.println("LowEngine.run()");
	}
	
}
