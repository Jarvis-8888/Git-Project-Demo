package com.git.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList();

		list.add("rohit");
		list.add("sujit");
		list.add("mohit");
		list.add("yogesh");

		for(String s:list) {
			System.out.println(s);
		}
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "lalit");
		map.put(2, "paresh");
		map.put(3, "shyam");
		
		System.out.println(map);
	}

}
