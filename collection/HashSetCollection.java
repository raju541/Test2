package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import java.util.*;
public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new HashSet<Integer>();  // doesn't maintain insertion order
		set.add(5);									// sorted order
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
