package com.lihl.mediator;

public class Market implements Department {
	private Mediator mediator;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	@Override
	public void selfAction() {
		System.out.println("Market.selfAction()");
	}

	@Override
	public void outAction() {
		System.out.println("Market.outAction()");
		mediator.command("finacial");
	}

}
