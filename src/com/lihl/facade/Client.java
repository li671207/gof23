package com.lihl.facade;


/**
 * 迪米特法则(最少知识原则)：
– 一个软件实体应当尽可能少的与其他实体发生相互作用

– 为子系统提供统一的入口。封装子系统的复杂性，便于客户端调用。

JDBC封装后的，commons提供的DBUtils类，
Hibernate提供的工具类、Spring JDBC工具类等
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.regester();
	}

}
