package com.lihl.mediator;

public class Development implements Department {
	
	private Mediator mediator;
	
	public Development() {
	}

	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("Development.selfAction()");
	}

	@Override
	public void outAction() {
		System.out.println("Development.outAction()");
	}

}
