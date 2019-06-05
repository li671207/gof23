package com.lihl.command;

public class Invoke {

	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}

	void call() {
		System.out.println("Invoke.call()");
		command.execute();
	}

}
