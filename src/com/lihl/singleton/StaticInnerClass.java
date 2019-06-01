package com.lihl.singleton;

public class StaticInnerClass {
	
	private StaticInnerClass(){
	}
	
	private static class InnerClass {
		private static StaticInnerClass instance = new StaticInnerClass();
	}
	
	public static StaticInnerClass getInstance() {
		return InnerClass.instance;
	}
	
}
