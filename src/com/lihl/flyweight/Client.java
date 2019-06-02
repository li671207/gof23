package com.lihl.flyweight;


/**
 * – FlyweightFactory享元工厂类
• 创建并管理享元对象，享元池一般设计成键值对
– FlyWeight抽象享元类
• 通常是一个接口或抽象类，声明公共方法，这些方法可以向外界提供对象
的内部状态，设置外部状态。
– ConcreteFlyWeight具体享元类
• 为内部状态提供成员变量进行存储
– UnsharedConcreteFlyWeight非共享享元类
• 不能被共享的子类可以设计为非共享享元类


– 享元模式由于其共享的特性，可以在任何“池”中操作，
比如：线程池、数据库连接池。
– String类的设计也是享元模式
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		ChessFlyweight flyweight = ChessFlyweightFactory.getFlyweight("red");
		ChessFlyweight flyweight1 = ChessFlyweightFactory.getFlyweight("red");
		
		System.out.println(flyweight == flyweight1);
		
		flyweight.display(new Coordinate("11", "22"));
	}

}
