package com.lihl.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	private Star realStar;
	
	public StarHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("真实方法执行前");
		System.out.println("confer/signContract/bookTicket");
		if ("sing".equals(method.getName())) {
			object = method.invoke(realStar, args);
		} 
		System.out.println("真实方法执行后");
		System.out.println("collectMoney");
		
		return object;
	}

}
