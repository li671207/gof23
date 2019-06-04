package com.lihl.chain;

public class LeaveRequest {

	private String name;
	private long leaveDays;
	private String reason;

	public LeaveRequest(String name, long leaveDays, String reason) {
		super();
		this.name = name;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(long leaveDays) {
		this.leaveDays = leaveDays;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "LeaveRequest [name=" + name + ", leaveDays=" + leaveDays + ", reason=" + reason + "]";
	}

}
