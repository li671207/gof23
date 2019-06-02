package com.lihl.bridge;


/**
 * – 桥接模式可以取代多层继承的方案。 多层继承违背了单一职责原则，
复用性较差，类的个数也非常多。桥接模式可以极大的减少子类的个
数，从而降低管理和维护的成本。
– 桥接模式极大的提高了系统可扩展性，在两个变化维度中任意扩展一
个维度，都不需要修改原有的系统，符合开闭原则。
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Brand brand = new Lenove();
		Computer computer = new Desktop(brand);
		
		computer.sale();
	}

}
