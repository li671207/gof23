package com.lihl.mediator;

public class Finacial implements Department {

	private Mediator mediator;
	
	public Finacial() {
		// TODO Auto-generated constructor stub
	}

	public Finacial(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("finacial", this);
	}

	@Override
	public void selfAction() {
		System.out.println("Finacial.selfAction()");
	}

	@Override
	public void outAction() {
		System.out.println("Finacial.outAction()");
	}

}
