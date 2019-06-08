package com.lihl.observer2;

public class Client {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		ObserverA observer1 = new ObserverA();
		ObserverA observer2 = new ObserverA();
		ObserverA observer3 = new ObserverA();
		
		concreteSubject.addObserver(observer1);
		concreteSubject.addObserver(observer2);
		concreteSubject.addObserver(observer3);
		
		concreteSubject.update(111);
		
		System.out.println(observer1.getState());
		System.out.println(observer2.getState());
		System.out.println(observer3.getState());
	}

}
