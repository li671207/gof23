package com.lihl.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * – 聚合对象：存储数据
– 迭代器：遍历数据
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteAggregate concreteAggregate = new ConcreteAggregate(new ArrayList<>());
		concreteAggregate.addObject("aa");
		concreteAggregate.addObject("bb");
		concreteAggregate.addObject("cc");
		concreteAggregate.addObject("dd");
		concreteAggregate.addObject("ee");
		
		MyIterator iterator = concreteAggregate.createIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.currentObject());
			iterator.next();
		}
	}

}
