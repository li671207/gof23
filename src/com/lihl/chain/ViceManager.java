package com.lihl.chain;

public class ViceManager extends Leader {

	public ViceManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 20) {
			System.out.println("ViceManager.handleRequest():Pass");
			System.out.println(request);
		} else {
			if (nextLeader != null) {
				this.nextLeader.handleRequest(request);
			}
		}
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", nextLeader=" + nextLeader + "]";
	}
	
}
