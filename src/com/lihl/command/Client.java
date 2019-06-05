package com.lihl.command;


/**
 * 将一个请求封装为一个对象，
 * 用不同的请求对客户进行参数化；
 * 对请求排队；
 * 记录请求日志；
 * 支持可撤销操作；
 * 
 * Command:抽象命令
 * ConcreteCommand:具体命令
 * Invoker:调用者/请求者
 * 请求的发送者，通过命令对象来执行请求。
 * 不需要设计时确定具体的接收者，只与抽象命令类有关联。
 * 调用命令对象的execute()，间接调用接收者对象。
 * Receiver:接收者
 * 对请求的业务处理。
 * 为抽象前，实际执行操作内容的对象。
 * Client:客户类
 * 创建调用者，创建命令对象。
 * 创建命令对象时执行接收者。
 * 调用者和接收者没有直接关系，通过命令对象交互
 * 
 * 
 * – Struts2中，action的整个调用过程中就有命令模式。
– 数据库事务机制的底层实现
– 命令的撤销和恢复
 *
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoke invoke = new Invoke(command);
		
		invoke.call();
	}

}
