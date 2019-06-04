package com.lihl.chain;

public abstract class Leader {
	protected String name;
	protected Leader nextLeader;
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	public abstract void handleRequest(LeaveRequest request);
	
	public void setNextLeader(Leader leader) {
		this.nextLeader = leader;
	}

}
