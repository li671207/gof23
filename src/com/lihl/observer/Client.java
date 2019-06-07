package com.lihl.observer;

/**
 * 主要用于1:N的通知。当一个对象状态发生变化，即时通知到其他一系列对象，做出相应的相应。 推：
 * 每次都会把通知以广播方式发送给其它观察者，观察者只能被动接收 拉： 观察者只需知道有通知即可，由观察者决定何时获取内容以及获取什么内容。
 * 
 * JAVASE :Observable和Observer
 * 
 * – 聊天室程序的，服务器转发给所有客户端 – 网络游戏(多人联机对战)场景中，服务器将客户端的状态进行分发 – 邮件订阅 –
 * Servlet中，监听器的实现 – Android中，广播机制 – JDK的AWT中事件处理模型,基于观察者模式的委派事件模型(Delegation
 * Event Model) • 事件源----------------目标对象 • 事件监听器------------观察者 –
 * 京东商城中，群发某商品打折信息
 * 
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();

		ObserverA observer1 = new ObserverA();
		ObserverA observer2 = new ObserverA();
		ObserverA observer3 = new ObserverA();

		concreteSubject.registerObserver(observer1);
		concreteSubject.registerObserver(observer2);
		concreteSubject.registerObserver(observer3);

		concreteSubject.setState(11);

		System.out.println(observer1.getState());
		System.out.println(observer2.getState());
		System.out.println(observer3.getState());

	}

}
