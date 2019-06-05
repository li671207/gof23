package com.lihl.command;

public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		//命令真正执行前或后，执行相关的处理！
		System.out.println("ConcreteCommand.execute()");
		receiver.action();
	}

}
