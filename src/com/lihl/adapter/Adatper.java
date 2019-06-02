package com.lihl.adapter;

public class Adatper implements Target {
	
	private Adaptee adaptee;
	
	public Adatper() {
	}
	
	public Adatper(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void handlerReq() {
		System.out.println("通过包装一个需要适配的对象，把原接口转换成目标接口");
		adaptee.request();
	}

}
