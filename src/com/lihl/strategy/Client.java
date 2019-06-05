package com.lihl.strategy;


/**
 * – 策略模式对应于解决某一个问题的一个算法族，允许用户从该算法族
中任选一个算法解决某一问题，同时可以方便的更换算法或者增加新
的算法。并且由客户端决定调用哪个算法。

• 本质：– 分离算法，选择实现。
• 开发中常见的场景：– JAVASE中GUI编程中，布局管理– Spring框架中，Resource接口，资源访问策– javax.servlet.http.HttpServlet#service()
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context(new NewCustomerManeyStrategy());
		context.printPrince(100);
	}

}
