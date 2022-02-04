package com.cts.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new LinkedHashSet<Integer>(); // maintain insertion order
		set.add(5);
		set.add(3);         // only Unique elements
		set.add(3);         // not allows duplicate elements
		set.add(4);
		set.add(2);     
		set.add(1);
		set.add(null);    // allows only one null value
		set.add(null);
		//System.out.println(set);
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		/*for (Integer i : set) {
			System.out.println(i);
		}*/
	 								// no for loop because no get()
	}

}
