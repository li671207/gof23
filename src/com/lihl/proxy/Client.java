package com.lihl.proxy;

import java.lang.reflect.Proxy;


/**
 * – 切面（Aspect）：其实就是共有功能的实现。
 * – 通知（Advice）：是切面的具体实现。
 * – 连接点（Joinpoint）：就是程序在运行过程中能够插入切面的地点。
 * – 切入点（Pointcut）：用于定义通知应该切入到哪些连接点上。
 * – 目标对象（Target）：就是那些即将切入切面的对象，也就是那些被通知的对象– 代理对象（Proxy）：将通知应用到目标对象之后被动态创建的对象。
 * – 织入（Weaving）：将切面应用到目标对象从而创建一个新的代理对象的过程
 * @author lihl
 *
 */
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
