package com.lihl.adapter;

public class Client {

	public static void main(String[] args) {
		//对象适配
		Adatper adatper = new Adatper(new Adaptee());
		adatper.handlerReq();
		
		//类适配
		Target adatper2 = new Adatper2();
		adatper2.handlerReq();
	}

}
