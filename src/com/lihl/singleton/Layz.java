package com.lihl.singleton;

import java.io.Serializable;

public class Layz implements Serializable{
	private static Layz layz;
	
	private Layz() {
		if (layz != null) {
			throw new RuntimeException("只能创建一个对象");
		}
	}
	
	public static synchronized Layz getInstance() {
		if (layz == null) {
			layz = new Layz();
		}
		
		return layz;
	}
	
	

}
