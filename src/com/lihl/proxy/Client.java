package com.lihl.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		//静态代理
		Star star = new ProxyStar(new RealStar());
		star.bookTicket();
		star.collectMoney();
		star.confer();
		star.signConstract();
		star.sing();
		
		//动态代理
		Star star2 = new RealStar();
		StarHandler starHandler = new StarHandler(star2);
		Star star3 = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
		star3.sing();
	}

}
