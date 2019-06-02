package com.lihl.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * – 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
– 就是java中的克隆技术，以某个对象为原型，复制出新的对象。显然，新的对象具备原型对象的特点
– 优势有：效率高(直接克隆，避免了重新执行构造过程步骤) 。
– 克隆类似于new，但是不同于new。new创建新的对象属性采用的是默认值。克隆出的
对象的属性值完全和原型对象相同。并且克隆出的新对象改变不会影响原型对象。然后，
再修改克隆对象的值。
 * @author lihl
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		//浅克隆
		System.out.println("==========浅克隆==================");
		Date date = new Date();
		date.setTime(24141241241411l);
		Sheep sheep = new Sheep("喜洋洋", date);
		System.out.println(sheep);
		
		Sheep sheep1 = (Sheep) sheep.clone();
		date.setTime(12313413213131l);
		sheep1.setName("美羊羊");
		System.out.println(sheep1);
		//深克隆
		//1.克隆属性
		System.out.println("==========深克隆：属性克隆===============");
		Sheep2 sheep2 = new Sheep2("喜洋洋", date);
		System.out.println(sheep2);
		
		Sheep2 sheep3 = (Sheep2) sheep2.clone();
		date.setTime(12313413213131l);
		sheep2.setName("美羊羊");
		System.out.println(sheep3);
		//2.序列化及反序列化克隆
		System.out.println("==========深克隆：序列化及反序列化克隆===============");
		System.out.println(sheep);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(sheep);
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep sheep4 = (Sheep) ois.readObject();
		date.setTime(12313413213131l);
		System.out.println(sheep4);
		
		//耗时Test
		System.out.println("==========耗时Test===============");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			new Test();
		}
		long end = System.currentTimeMillis();
		System.out.println("new创建对象："+ (end-start));
		
		long start1 = System.currentTimeMillis();
		Test test = new Test();
		for (int i = 0; i < 1000; i++) {
			test.clone();
		}
		long end1 = System.currentTimeMillis();
		System.out.println("clone创建对象："+ (end1-start1));
	}

}


class Test implements Cloneable{
	public Test() {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}


