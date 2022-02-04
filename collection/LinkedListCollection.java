package com.cts.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new LinkedList<Integer>();		// maintains insertion order
		
		list.add(10);
		list.add(9);
		list.add(9);		//allows duplicate elements and null value
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(null);
		list.add(null);
		
		//System.out.println(list);
		
		Iterator<Integer> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		/*for (Integer i : list) {
			System.out.println(i);
		}
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
	}

}
