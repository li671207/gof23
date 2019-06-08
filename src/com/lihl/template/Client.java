package com.lihl.template;


/**
 * 定义操作中算法骨架，具体步骤父类定义，具体实现延迟到子类处理
 * @author Lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Bank drawMoney = new DrawMoney();
		drawMoney.process();
	}

}
