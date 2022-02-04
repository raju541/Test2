package com.cts.collection;

import java.util.*;
import java.util.Map.Entry;


public class LinkedHashMapDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(5, "rajan");			// maintain insertion order
		map.put(3, "ramu");
		map.put(3, "ramesh");			//only unique keys
		map.put(4, "ramu");
		map.put(2, "raju");				//multiple null values
		map.put(1, "rama");
		map.put(null, "rajan");			//only one null key
		map.put(6, null);				
		//System.out.println(map);
		
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> entry=(Entry<Integer,String>)itr.next();
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		/*for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}*/
	}

}
