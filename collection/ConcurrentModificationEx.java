package com.cts.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<Integer,String> map=new HashMap<Integer,String>();
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(1, "hari");
		map.put(2, "nani");
		map.put(3, "rajan");
		//map.put(null, "prasad"); //NullPointerException in ConcurrentHashMap
		System.out.println(map);
		
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		System.out.println("remove key is 2:");
		while(itr.hasNext()) {
		Entry<Integer,String> entry=itr.next();
			map.remove(2,"nani");
		}
		System.out.println(map);
	}
}
