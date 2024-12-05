package com.app.core;

import java.util.HashMap;
import java.util.Map;

public class MapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,Integer> map=  new HashMap<>(); 
       map.put("a", 10);
       map.put("b", 20);
       map.put("c", 30);
       System.out.println(map);
       map.putIfAbsent("a", 10);
       map.putIfAbsent("a", 40);
       map.putIfAbsent("d", 10);
       map.putIfAbsent("e", 50);
       System.out.println(map);
	}

}
