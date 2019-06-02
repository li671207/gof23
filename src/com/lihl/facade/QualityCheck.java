package com.lihl.facade;

public interface QualityCheck {
	
	void orgCodeCheck();

}

class MyQualityCheck implements QualityCheck {

	@Override
	public void orgCodeCheck() {
		System.out.println("MyQualityCheck.orgCodeCheck()");
	}
	
}
