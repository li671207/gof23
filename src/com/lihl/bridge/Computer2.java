package com.lihl.bridge;

/**
 * 未使用桥接模式
 * @author lihl
 *
 */
public interface Computer2 {
	void sale();
}

class Desktop2 implements Computer2 {
	@Override
	public void sale() {
		System.out.println("销售台式机！");
	}
}

class Laptop2 implements Computer2 {
	@Override
	public void sale() {
		System.out.println("销售笔记本！");
	}
}
class Pad implements Computer2 {
	@Override
	public void sale() {
		System.out.println("销售平板电脑！");
	}
}

class LenovoDesktop2 extends Desktop2 {
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}
class LenovoLaptop2 extends Laptop2 {
	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}
class LenovoPad extends Pad {
	@Override
	public void sale() {
		System.out.println("销售联想平板电脑");
	}
}



class ShenzhouDesktop2 extends Desktop2 {
	@Override
	public void sale() {
		System.out.println("销售神舟台式机");
	}
}
class ShenzhouLaptop2 extends Laptop2 {
	@Override
	public void sale() {
		System.out.println("销售神舟笔记本");
	}
}
class ShenzhouPad extends Pad {
	@Override
	public void sale() {
		System.out.println("销售神舟平板电脑");
	}
}


class DellDesktop2 extends Desktop2 {
	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}
class DellLaptop2 extends Laptop2 {
	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}
class DellPad extends Pad {
	@Override
	public void sale() {
		System.out.println("销售戴尔平板电脑");
	}
}
