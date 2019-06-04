package com.lihl.chain;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 30) {
			System.out.println("GeneralManager.handleRequest():Pass");
			System.out.println(request);
		} else {
			System.err.println("GeneralManager.handleRequest():Reject!");
		}
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", nextLeader=" + nextLeader + "]";
	}
	
}
