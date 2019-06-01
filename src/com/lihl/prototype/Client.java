package com.lihl.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


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
		System.out.println("==========深克隆：属性克隆==================");
		Sheep2 sheep2 = new Sheep2("喜洋洋", date);
		System.out.println(sheep2);
		
		Sheep2 sheep3 = (Sheep2) sheep2.clone();
		date.setTime(12313413213131l);
		sheep2.setName("美羊羊");
		System.out.println(sheep3);
		//2.序列化及反序列化克隆
		System.out.println("==========深克隆：序列化及反序列化克隆==================");
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
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}


