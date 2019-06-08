package com.lihl.template;

public abstract class Bank {
	
	public void takeNumber() {
		System.out.println("Bank.takeNumber()");
	}
	
	public abstract void transact();
	
	public void evaluate() {
		System.out.println("Bank.evaluate()");
	}
	
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}

}
