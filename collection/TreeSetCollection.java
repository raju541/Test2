package com.cts.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new TreeSet<Integer>();   //doesn't maintain insertion order
		set.add(5);
		set.add(3);         // only Unique elements
		set.add(3);         // not allows duplicate elements
		set.add(4);
		set.add(2);     
		set.add(1);
		set.remove(4);
	
		//set.add(null);    //doesn't allows null value
		//set.add(null);	//in runtime NullPointerException
		System.out.println(set);
		
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
