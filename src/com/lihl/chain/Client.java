package com.lihl.chain;


/**
 * – Java中，异常机制就是一种责任链模式。一个try可以对应多个catch，
当第一个catch不匹配类型，则自动跳到第二个catch. – Javascript语言中，事件的冒泡和捕获机制。Java语言中，事件的处理
采用观察者模式。
– Servlet开发中，过滤器的链式处理
– Struts2中，拦截器的调用也是典型的责任链模式
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Leader director = new Director("director");
		Leader manager = new Manager("manager");
		Leader viceManager = new ViceManager("viceManager");
		Leader generalManager = new GeneralManager("generalManager");
		
		director.setNextLeader(manager);
		manager.setNextLeader(viceManager);
		viceManager.setNextLeader(generalManager);
		
		director.handleRequest(new LeaveRequest("Test", 3, "TestReason"));
	}

}
