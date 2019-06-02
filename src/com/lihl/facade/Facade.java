package com.lihl.facade;

public class Facade {
	
	public void regester() {
		System.out.println("Facade.regester()");
		AIC aic = new MyAIC();
		QualityCheck qualityCheck = new MyQualityCheck();
		Bank bank = new MyBank();
		Tax tax = new MyTax();
		aic.nameCheck();
		qualityCheck.orgCodeCheck();
		bank.openAcct();
		tax.taxCheck();
	}

}
