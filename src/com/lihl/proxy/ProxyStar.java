package com.lihl.proxy;

public class ProxyStar implements Star {
	
	private RealStar realstar;
	
	public ProxyStar() {
	}

	public ProxyStar(RealStar realstar) {
		super();
		this.realstar = realstar;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");

	}

	@Override
	public void signConstract() {
		System.out.println("ProxyStar.signConstract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		realstar.sing();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

}
