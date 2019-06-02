package com.lihl.adapter;

/**
 * – 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象
的类，也可以是接口。
– 需要适配的类（Adaptee）：需要适配的类或适配者类。
– 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成
目标接口。
 * @author lihl
 *
 */
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
