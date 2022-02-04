package com.cts.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>(); 
		map.put(100, "Rajan"); 
		map.put(101, "Hari"); 
		map.put(102, "Chandu"); 
  
		map.putIfAbsent(101, "Hari"); 
  
		map.remove(101, "Hari"); 
  
		map.putIfAbsent(103, "Prasad"); 
  
		map.replace(102, "Prasad"); 
        System.out.println(map);
	}

}
