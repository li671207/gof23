package com.lihl.chain;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if (request.getLeaveDays() < 10) {
			System.out.println("Director.handleRequest():Pass");
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
