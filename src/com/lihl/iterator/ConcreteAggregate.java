package com.lihl.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<>();
	
	public ConcreteAggregate(List<Object> list) {
		super();
		this.list = list;
	}

	public void addObject(Object object) {
		list.add(object);
	}

	public void removeObject(Object object) {
		list.remove(object);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	@Override
	public MyIterator createIterator() {
		return new ConcreteMyIterator(new ConcreteAggregate(list));
	}

}
