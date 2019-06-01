package com.lihl.singleton;

import java.lang.reflect.Constructor;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Hungry hungry = Hungry.getInstance();//饿汉式：线程安全，调用效率高，不支持延迟加载
		Hungry hungry1 = Hungry.getInstance();
		System.out.println(hungry == hungry1);
		Layz layz = Layz.getInstance();//懒汉式：线程安全，调用效率不高，支持延迟加载
		Layz layz1 = Layz.getInstance();
		Class<Layz> clazz = (Class<Layz>) Class.forName("com.lihl.singleton.Layz");
		Constructor<Layz> constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Layz layz2 = (Layz) constructor.newInstance();
		
		System.out.println(layz == layz1);
		StaticInnerClass staticInnerClass = StaticInnerClass.getInstance();//静态内部类：线程安全，调用效率高，支持延迟加载
		StaticInnerClass staticInnerClass1 = StaticInnerClass.getInstance();
		System.out.println(staticInnerClass == staticInnerClass1);
		Enum enum1 = Enum.INSTANCE;//枚举类：线程安全，调用效率高，不支持延迟加载
		Enum enum2 = Enum.INSTANCE;
		System.out.println(enum1 == enum2);
	}

}
