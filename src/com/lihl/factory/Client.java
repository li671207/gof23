package com.lihl.factory;

import com.lihl.factory.abstractfactory.CarFactory;
import com.lihl.factory.abstractfactory.Engine;
import com.lihl.factory.abstractfactory.LowCarFactory;
import com.lihl.factory.abstractfactory.LuxuryCarFactory;
import com.lihl.factory.abstractfactory.Seat;


/**
 * 应用场景
– JDK中Calendar的getInstance方法
– JDBC中Connection对象的获取
– Hibernate中SessionFactory创建Session
– spring中IOC容器创建管理bean对象
– XML解析时的DocumentBuilderFactory创建解析器对象
– 反射中Class对象的newInstance()
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		//简单工厂
		Car car = SimpleFactory.getCar("Tesla");
		car.run();
		Car audi = SimpleFactory.createAudi();
		audi.run();
		
		//工厂方法
		TeslaFactory teslaFactory = new TeslaFactory();
		Car tesla = teslaFactory.createCar();
		tesla.run();
		
		//抽象工厂
		CarFactory luxuryCarFactory = new LuxuryCarFactory();
		CarFactory lowCarFactory = new LowCarFactory();
		Engine engine = luxuryCarFactory.createEngine();
		Seat seat = lowCarFactory.createSeat();
		engine.run();
		engine.star();
		seat.massage();
		
	}

}
