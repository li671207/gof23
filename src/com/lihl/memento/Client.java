package com.lihl.memento;

/**
 * • 核心 – 就是保存某个对象内部状态的拷贝，这样以后就可以将该对象恢复到 原先的状态。 • 结构： – 源发器类Originator –
 * 备忘录类Memento – 负责人类CareTaker
 * 
 * 
 * – 棋类游戏中的，悔棋 
 * – 普通软件中的，撤销操作 
 * – 数据库软件中的，事务管理中的，回滚操作 
 * – Photoshop软件中的，历史记录
 * 
 * 
 * • 备忘点较多时： 
 * – 将备忘录压栈 
 * – 将多个备忘录对象，序列化和持久化 
 * public class CareTaker {
 *  	private Memento memento; 
 *  	private Stack<Memento> stack = new Stack<Memento>(); 
 * }
 * 
 * @author Lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Emp emp = new Emp("test", 10, 100);

		System.out.println("once:" + emp);
		careTaker.setMemento(emp.memento());

		emp.setAge(22);
		emp.setName("admin");
		emp.setSalary(111);

		System.out.println("twice:" + emp);

		emp.recovery(careTaker.getMemento());

		System.out.println("thrice:" + emp);

	}

}
