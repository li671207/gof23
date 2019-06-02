package com.lihl.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 
 * – Component抽象构件角色：
• 真实对象和装饰对象有相同的接口。这样，客户端对象就能够以与真实对象相同的方式同装饰
对象交互。
– ConcreteComponent 具体构件角色(真实对象)：
• io流中的FileInputStream、FileOutputStream
– Decorator装饰角色：
• 持有一个抽象构件的引用。装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象
。这样，就能在真实对象调用前后增加新的功能。
– ConcreteDecorator具体装饰角色：
• 负责给构件对象增加新的责任
 * 
 * 
 * IO流实现细节：
– Component抽象构件角色：io流中的InputStream、OutputStream、Reader、Writer 
– ConcreteComponent 具体构件角色：io流中的FileInputStream、FileOutputStream
– Decorator装饰角色：持有一个抽象构件的引用：io流中的FilterInputStream、FilterOutputStream
– ConcreteDecorator具体装饰角色：负责给构件对象增加新的责任。Io流中的BufferedOutputStream、BufferedInputStream等。

 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		ICar car = new Car();
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
		
		SwimCar car2 = new SwimCar(new AiCar(car));
		car2.move();
		
//		Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(""))));
	}

}
