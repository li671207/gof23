package com.lihl.chain;

public class Client {

	public static void main(String[] args) {
		Leader director = new Director("director");
		Leader manager = new Manager("manager");
		Leader viceManager = new ViceManager("viceManager");
		Leader generalManager = new GeneralManager("generalManager");
		
		director.setNextLeader(manager);
		manager.setNextLeader(viceManager);
		viceManager.setNextLeader(generalManager);
		
		director.handleRequest(new LeaveRequest("Test", 3, "TestReason"));
	}

}
