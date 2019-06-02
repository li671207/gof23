package com.lihl.flyweight;

import java.util.HashMap;
import java.util.Map;


/**
 * FlyweightFactory享元工厂类
 * @author lihl
 *
 */
public class ChessFlyweightFactory {
	private static Map<String, ChessFlyweight> map = new HashMap<>();
	
	public static ChessFlyweight getFlyweight(String color) {
		
		if (map.get(color) == null) {
			 ChessFlyweight flyweight = new ChessFlyweight(color);
			 map.put(color, flyweight);
			 return flyweight;
		} else {
			return map.get(color);
		}
		
	}

}
